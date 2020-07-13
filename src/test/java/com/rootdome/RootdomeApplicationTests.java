package com.rootdome;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mysql.cj.Query;
import com.rootdome.generator.entity.Arealist;
import com.rootdome.generator.entity.Outputequipment;
import com.rootdome.generator.entity.Users;
import com.rootdome.generator.entity.Wifiinputequipment;
import com.rootdome.generator.mapper.UsersMapper;
import com.rootdome.generator.service.ArealistService;
import com.rootdome.generator.service.OutputequipmentService;
import com.rootdome.generator.service.UsersService;
import com.rootdome.generator.service.WifiinputequipmentService;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class RootdomeApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    UsersService usersService;
    @Autowired
    OutputequipmentService outputequipmentService;
    @Test
    void select(){
        System.out.println(JSON.toJSONString(outputequipmentService.selectAll()));
        System.out.println(JSON.toJSONString(usersService.selectAll()));
        System.out.println(JSON.toJSONString(arealistService.selectAll()));
    }

    @Test
    void  addUsers(){
        Users user = new Users();
        user.setUserid(4);
        user.setUsername("33");
        user.setPwd("11");
        user.setPhone("22");
        if (usersService.add(user)>0) System.out.println("新增成功");
        else System.out.println("新增失败");
    }

    @Test
    void  add2(){
        Outputequipment oe = new Outputequipment();
        oe.setName("d");
        oe.setEquipmenyMark("2005");
        oe.setType("杀虫");
        oe.setState("可用");
        oe.setAreaID(3);
        oe.setOutputPort("I005");
        oe.setSwithIndex(3);
        if (outputequipmentService.add(oe)>0) System.out.println("新增成功！");
        else System.out.println("新增失败！");
    }

    @Test
    public void del2(){
        if (outputequipmentService.del("d")>0) System.out.println("删除成功！");
        else System.out.println("删除失败！");
    }

    @Test
    public void update2(){
        Outputequipment oe = new Outputequipment();
        oe.setName("d");
        oe.setState("不可用");
        if (outputequipmentService.update(oe)>0) System.out.println("修改成功！");
        else System.out.println("修改失败！");
    }

    @Autowired
    ArealistService arealistService;

    @Test
    public void add3(){
        Arealist a = new Arealist();
        a.setAreaName("qq");
        a.setAreaPicture("22");
        a.setAreaQuickMark("33");
        if (arealistService.add(a)>0) System.out.println("新增成功！");
        else System.out.println("新增失败！");
    }

    @Test
    public void del3(){
        if (arealistService.del(4)>0) System.out.println("删除成功！");
        else System.out.println("删除失败！");
    }

    @Test
    public  void update3(){
        Arealist a = new Arealist();
        a.setAreaID(5);
        a.setAreaPicture("666");
        if (arealistService.update(a)>0) System.out.println("修改成功！");
        else System.out.println("修改失败！");
    }

    @Autowired
    WifiinputequipmentService wifiinputequipmentService;
    @Test
    public void add4(){
        Wifiinputequipment we = new Wifiinputequipment();
        we.setName("e");
        we.setEquipmentMark("1006");
        we.setOutputPort("I006");
        we.setType("光感");
        we.setState("可用");
        we.setAreaID(4);

        wifiinputequipmentService.add(we);
    }
    @Test
    public void  del4(){
        wifiinputequipmentService.delete("e");
    }
    @Test
    public  void  update(){
        Wifiinputequipment we = new Wifiinputequipment();
        wifiinputequipmentService.update(we);
    }
    @Test
    void SelectD(){
        System.out.println(JSON.toJSONString(wifiinputequipmentService.selectD()));
    }



    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/aaa?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        autoGenerator.setDataSource(dataSourceConfig);
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("southwind");
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.southwind.mybatisplus");
        packageConfig.setModuleName("generator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        //strategyConfig.setDbColumnUnderline(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();
    }
}
