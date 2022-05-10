package com.trail;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.testcases.calcapp.CalculatorTest;
import com.testcases.studentapp.trail.UserTest;
@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.testcases.calcapp,com.testcases.studentapp"})
// @SelectClasses({UserTest.class,CalculatorTest.class}) */
@SelectPackages({"com.testcases.studentapp"})
//@IncludePackages({"com.testcases.studentapp.trail"})

@ExcludePackages({"com.testcase.studentapp.trail"})
public class AllTests {

}
