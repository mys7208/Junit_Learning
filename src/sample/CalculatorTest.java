/**
 * 
 */
package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 計算クラスのテスト
 */
class CalculatorTest {

    /**
     * 加算処理のテスト
     */
    @Test
    void testAdd() {
    	
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3)); // 期待値と実際の値を比較
    
    }

    /**
     * 減算処理のテスト
     */
    @Test
    void testSubtract() {
    
    	Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2)); // 期待値と実際の値を比較
        
    }

}
