/**
 * 
 */
package java8prog;

import java.util.List;

/**
 * @author lenovo
 *
 */
@FunctionalInterface
public interface FebonucciSeriesGenerator {

	List<Integer> generateFebonucci(int endNo);
}