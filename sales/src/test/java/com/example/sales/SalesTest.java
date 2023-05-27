import com.example.sales.services.CartService;
import com.example.sales.services.OrderService;
import com.example.sales.services.ProductService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
public class SalesTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private CartService service;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    // write test cases here
}