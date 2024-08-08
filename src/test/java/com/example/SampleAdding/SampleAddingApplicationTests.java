package com.example.SampleAdding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleAddingApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Test 
	// void FailTestCase() {
    //    int result = SampleAddingApplication.getSum(11, 12);
    //    int expected = 28;
    //    assertEquals(expected,result);
    // }
    
    @Test 
	void getSum() {
       int result = SampleAddingApplication.getSum(10, 12);
       int expected = 22;
       assertEquals(expected,result);
    }

    @Test 
	void main(){
        SampleAddingApplication.main(new String[]{});
    }

}
