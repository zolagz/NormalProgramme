package agent;

import java.lang.instrument.Instrumentation;

public class pre_MyProgram
{
	/**
	 * �÷�����main����֮ǰ���У���main����������ͬһ��JVM�� ����ͬһ��System ClassLoaderװ��
	 * ��ͳһ�İ�ȫ����(security policy)��������(context)����
	 */
	public static void premain(String agentOps, Instrumentation inst)
	{

		System.out.println("====premain ����ִ��");
		System.out.println(agentOps);

	}

	/**
	 * ��������� premain(String agentOps, Instrumentation inst) ���ִ�� premain(String
	 * agentOps)
	 */
	public static void premain(String agentOps)
	{

		System.out.println("====premain����ִ��2====");
		System.out.println(agentOps);
	}

	public static void main(String[] args)
	{
	}

}