/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author plaul1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({test.plainDemoTest.class, test.BookIntegrationTest.class,  test.InitialSeedRestIntegrationTest.class})
public class TestAll {
  
}
