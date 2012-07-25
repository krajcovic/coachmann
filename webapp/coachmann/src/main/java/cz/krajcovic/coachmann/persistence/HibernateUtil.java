package cz.krajcovic.coachmann.persistence;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() throws HibernateException{

		// Deprecated
		// Create the SessionFactory from hibernate.cfg.xml
		// return new Configuration().configure().buildSessionFactory();

		Configuration configuration = new Configuration();
		configuration.configure();

		return configuration.buildSessionFactory(new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry());

	}

	/**
	 * @return the sessionfactory
	 */
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionfactory().close();
	}

}
