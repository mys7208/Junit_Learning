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
     * 加算処理テスト
     */
    @Test
    void testAdd() {
    	
    	// Calculatorクラスを生成
        Calculator calc = new Calculator();
        
        // 加算処理(add)を実行して加算結果を比較
        assertEquals(5, calc.add(2, 3)); // 期待値と実際の値を比較
    
    }

    /**
     * 減算処理
     */
    @Test
    void testSubtract() {
    
    	// Calculatorを生成
    	Calculator calc = new Calculator();

    	// 減算処理(subtract)を実行して減算結果を比較
        assertEquals(1, calc.subtract(3, 2)); // 期待値と実際の値を比較
        
    }

    /**
     * 乗算処理３
     */
    @Test
    void testMultiply() {
    	
    	// Calculatorを生成
    	Calculator calc = new Calculator();
    	
    	//　乗算処理(multiply)を実行して乗算結果を比較
    	assertEquals(6, calc.multiply(2, 3)); // 期待値と実際の値を比較
    	
    }
}
