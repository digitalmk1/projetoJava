package br.com.digitalmk.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.digitalmk.util.HibernateUtil;

public class GenericDAO<Entidade> {

	@SuppressWarnings("unused")
	private Class<Entidade> classe;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		// TODO Auto-generated constructor stub
		this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public void salvar (Entidade entidade) {

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
	
		try {
			
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
			// se de problema  na linha 17 ele vai desfazer tudo e entrar no rollback
		
		} catch (RuntimeException erro) {
			if(transacao != null) {
				transacao.rollback();
				
			}
		
			throw erro;
		}finally {
			sessao.close();
			
			
		}
	}
	
		@SuppressWarnings("unchecked")
		public List<Entidade> listar(){
			
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(classe);
				List<Entidade> resultado = consulta.list();
				return resultado;
				
			} catch (RuntimeException erro) {
				throw erro;
			}finally {
				sessao.close();
				
				
			}
			
		}
		@SuppressWarnings("unchecked")
		public Entidade buscar(long codigo){
			
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(classe);
				consulta.add(Restrictions.idEq(codigo));
				Entidade resultado = (Entidade) consulta.uniqueResult();
				return resultado;
				
			} catch (RuntimeException erro) {
				throw erro;
			}finally {
				sessao.close();
				
				
			}
			
		}
		
		public void excluir (Entidade entidade) {

			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			Transaction transacao = null;
		
			try {
				
				transacao = sessao.beginTransaction();
				sessao.delete(entidade);
				transacao.commit();
				// se de problema  na linha 17 ele vai desfazer tudo e entrar no rollback
			
			} catch (RuntimeException erro) {
				if(transacao != null) {
					transacao.rollback();
					
				}
			
				throw erro;
			}finally {
				sessao.close();
				
				
			}
		}
		
		public void editar (Entidade entidade) {

			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			Transaction transacao = null;
		
			try {
				
				transacao = sessao.beginTransaction();
				sessao.update(entidade);
				transacao.commit();
				// se de problema  na linha 17 ele vai desfazer tudo e entrar no rollback
			
			} catch (RuntimeException erro) {
				if(transacao != null) {
					transacao.rollback();
					
				}
			
				throw erro;
			}finally {
				sessao.close();
				
				
			}
			
		}
		
		public void merge(Entidade entidade) {

			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			Transaction transacao = null;
		
			try {
				
				transacao = sessao.beginTransaction();
				sessao.merge(entidade);
				transacao.commit();
				// se de problema  na linha 17 ele vai desfazer tudo e entrar no rollback
			
			} catch (RuntimeException erro) {
				if(transacao != null) {
					transacao.rollback();
					
				}
			
				throw erro;
			}finally {
				sessao.close();
				
				
			}
		}
}
