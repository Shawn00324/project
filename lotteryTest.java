package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lotteryTest {

	public static void main(String[] args) {
		Set num = new HashSet();
		while (num.size() != 6) {
			int r = (int)(Math.random()*49) + 1;
			num.add(r);
		}
		
		Iterator objs = num.iterator();
		System.out.println("幸運號碼如下："); 
		System.out.println(num);  //取得這個set的字串
		while (objs.hasNext())
			System.out.print(objs.next() + " ");  //取得元素，可以操作
		
	}

}
