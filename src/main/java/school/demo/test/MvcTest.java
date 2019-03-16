package school.demo.test;


import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class MvcTest {

    WebApplicationContext context;
    MockMvc mockMvc;



    @Before
    public  void  initMockMvc(){
        MockMvcBuilders.webAppContextSetup(context).build();

    }
    @Test
    public void testPage() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/stuList").param("pn", "1")).andReturn();

        MockHttpServletRequest request = mvcResult.getRequest();
        PageInfo pageInfo = (PageInfo)request.getAttribute("PageInfo");
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getPageSize());

        int[] nums = pageInfo.getNavigatepageNums();
        for (int num:nums) {
            System.out.println(num);
        }
    }

}
