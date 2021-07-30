package br.com.digitalmk.main;



import org.hibernate.Session;

import br.com.digitalmk.util.HibernateUtil;

public class HiberneteUtilTest {
	
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
