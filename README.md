# SpringUnitTestingDemo

For Unit Test Need, put the following annotations above the test class:
@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class) 


For Integration tests, put the following annotation above the test class

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

Check the commit : https://github.com/charugarg93/SpringUnitTestingDemo/commit/2bbb9ae5d0d1cc62d0771a86daf22e89cc723b76 for more details on Integration tests.
