package com.lzh.basedao;

import java.util.Random;


/**

 * @ClassName:  RandomUtil   

 * @Description:�����������   

 * @date:   2020��1��3�� ����9:07:35

 */

public class RandomUtil {

	/**

	 * @Title: random   

	 * @Description: ���ָ������������   

	 * @param: @param min

	 * @param: @param max

	 * @param: @return      

	 * @return: int      

	 * @throws

	 */

	public static int random(int min,int max) {

		Random random = new Random();

		int nextInt = random.nextInt(max-min+1);

		if(nextInt<min) {

			return random(min,max);

		}

		return nextInt;

	}

	

	public static void main(String[] args) {

		for(int i=0;i<100;i++) {

			System.out.println(random(1,5));

		}

	}



}
