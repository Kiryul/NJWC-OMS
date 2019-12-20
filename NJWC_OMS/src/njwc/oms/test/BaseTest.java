package njwc.oms.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 *
 配置spring和junit整合，junit启动时加载springIOC容器 
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
/*
 * @ContextConfiguration({"file:WebContent/WEB-INF/njwc-servlet.xml",
 * "classpath:config/*.xml", "file:WebContent/WEB-INF/web.xml",
 * "classpath:njwc.oms.mapper/ServiceMapper.xml"})
 */
@ContextConfiguration({"file:WebContent/WEB-INF/njwc-servlet.xml","classpath:config/beans.xml"})

public class BaseTest {

}
