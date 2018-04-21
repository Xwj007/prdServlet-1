package com.lvxz.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lvxz.DTO.*;
import com.lvxz.entity.*;
import com.lvxz.mapper.SqlMapper;
import com.lvxz.mapper.WorkMapper;
import com.lvxz.utils.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Introduction: 后端服务响应类
 * Created by  LvXZ  on 2018/3/31.
 */

@RestController
public class PrdServletController {

    //日志输出
    private final static Logger logger = LoggerFactory.getLogger(PrdServletController.class);

    @Autowired
    private SqlMapper sqlMapper;//引入MyBatis接口
    @Autowired
    private WorkMapper workMapper;

    /**********************************数据库查询操作**********************************/
    /**查询所有用户MenuTable 二级菜单**/
    @PostMapping(value = "/all_menu_2",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public List<MenuInfoDTO> all_menuResult_2(@RequestBody String params, HttpServletRequest request,
                                              HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();//将json格式的数据解析成类的对象
        JsonNode paramJson = objectMapper.readTree(params);
        String pm = paramJson.get("pm").textValue();//获取对象账号，密码

        logger.info("查询所有用户MenuTable数据库");
        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        List<MenuInfoDTO> menuInfoDTOS = sqlMapper.getMenuInfoDTOByParentMenu(pm);
        //return queryMenuTable(menuInfoDTOS);
        return menuInfoDTOS;
    }

    /**查询用户MenuTable一级菜单**/
    @PostMapping(value = "/all_menu_1",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> all_menuResult_1(HttpServletResponse rsp) {
        logger.info("查询所有用户MenuTable数据库");
        rsp.setHeader("Access-Control-Allow-Methods", "POST");

        List<MenuInfoDTO> menuInfoDTOS = sqlMapper.getMenuInfoDTOByParentMenu("root");
        ResponseInfoDTO responseInfoDTO = new ResponseInfoDTO(0, "成功",queryMenuTable(menuInfoDTOS));
        return responseInfoDTO;
    }

    /**递归查询所有用户MenuTable的菜单**/
    public List<MenuInfoDTO> queryMenuTable (List<MenuInfoDTO> menuInfoDTOS){
        for(MenuInfoDTO miDTO: menuInfoDTOS) {
            if (miDTO.getChild() == 1) {
                List<MenuInfoDTO> menuInfoDTOS_2 = sqlMapper.getMenuInfoDTOByParentMenu(miDTO.getMenuName());
                queryMenuTable(menuInfoDTOS_2);
                miDTO.setMenuInfoDTOList(menuInfoDTOS_2);
            }else{
                miDTO.setMenuInfoDTOList(null);
            }
        }
        return menuInfoDTOS;
    }


    /**********************************普通员工操作**********************************/
    /**用户登录管理**/
    @PostMapping(value = "/login",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> userLogin(@RequestBody String params, HttpServletRequest request,
                                             HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();//将json格式的数据解析成类的对象
        JsonNode paramJson = objectMapper.readTree(params);
        String id = paramJson.get("id").textValue();//获取对象账号，密码
        String password = paramJson.get("password").textValue();
        UserID userID = sqlMapper.findUserIDByLoginID(id);

        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        ResponseInfoDTO responseInfoDTO;
        if(userID == null){
            responseInfoDTO = new ResponseInfoDTO(Integer.valueOf(PropertiesUtil.getProperty("getone.failure.code")), PropertiesUtil.getProperty("getone.failure.msg"),null);

        }else if(userID.getPasswd().equals(password)){//消息提示工具类获取key// 正确码,字符型转为整型
            userID.setPasswd("********");
            List<UserRights> userRightsList = sqlMapper.findUserRightsByUserName(id);
            responseInfoDTO = new ResponseInfoDTO(Integer.valueOf(PropertiesUtil.getProperty("login.success.code")), PropertiesUtil.getProperty("login.success.msg"),userID);
        }else{
            responseInfoDTO = new ResponseInfoDTO(Integer.valueOf(PropertiesUtil.getProperty("login.failure.code")), PropertiesUtil.getProperty("login.failure.msg"),null);
        }
        return responseInfoDTO;
    }

    /**物料数据维护**/
    @PostMapping(value = "/m_tiitm001_all",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> m_tiitm001_all(@RequestBody String params, HttpServletRequest request,
                                                HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = objectMapper.readTree(params);

        System.out.println("m_tiitm001");

        List<Tiitm001DTO> tiitm001DTOS = workMapper.findAllTiitm001();

        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        ResponseInfoDTO responseInfoDTO;
        if(tiitm001DTOS.size() == 0 ){
            responseInfoDTO = new ResponseInfoDTO(-1, "提取数据列表失败",null);
        }else{
            responseInfoDTO = new ResponseInfoDTO(1, "提取数据列表成功",tiitm001DTOS);
        }
        return responseInfoDTO;
    }
    @PostMapping(value = "/m_tiitm001_one",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> m_tiitm001_one(@RequestBody String params, HttpServletRequest request,
                                                HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = objectMapper.readTree(params);
        String itemId = paramJson.get("itemId").textValue();

        Tiitm001 tiitm001 = workMapper.findTiitm001ByItemID(itemId);

        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        ResponseInfoDTO responseInfoDTO;
        if(tiitm001 == null ){
            responseInfoDTO = new ResponseInfoDTO(-11, "提取数据失败",null);
        }else{

            responseInfoDTO = new ResponseInfoDTO(11, "提取数据成功",tiitm001);
        }
        return responseInfoDTO;
    }




    /**物料数据维护**/
    @PostMapping(value = "/m_whxsdd_all",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> m_whxsdd_all(@RequestBody String params, HttpServletRequest request,
                                                  HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = objectMapper.readTree(params);

        System.out.println("m_whxsdd");

        List<Tdsal001DTO> tdsal001DTOS = workMapper.findAllTdsal001();

        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        ResponseInfoDTO responseInfoDTO;
        if(tdsal001DTOS.size() == 0 ){
            responseInfoDTO = new ResponseInfoDTO(-2, "提取订单列表失败",null);
        }else{
            responseInfoDTO = new ResponseInfoDTO(2, "提取订单列表成功",tdsal001DTOS);
        }
        return responseInfoDTO;
    }
    @PostMapping(value = "/m_whxsdd_one",produces="application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseInfoDTO<Object> m_whxsdd_one(@RequestBody String params,
                                                  HttpServletResponse rsp) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = objectMapper.readTree(params);
        String ddh = paramJson.get("ddh").textValue();

        Tdsal001 tdsal001 = workMapper.findTdsal001ByDDH(Long.parseLong(ddh));

        rsp.setHeader("Access-Control-Allow-Methods", "POST");
        ResponseInfoDTO responseInfoDTO;
        if(tdsal001 == null ){
            responseInfoDTO = new ResponseInfoDTO(-22, "提取数据失败",null);
        }else{

            responseInfoDTO = new ResponseInfoDTO(22, "提取数据成功",tdsal001);
        }
        return responseInfoDTO;
    }




}
