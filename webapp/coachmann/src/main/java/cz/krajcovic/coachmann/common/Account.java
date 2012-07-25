package cz.krajcovic.coachmann.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class Account implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	private String email;
	private byte[] password;
	private Timestamp created;
	private Byte state;
	private Timestamp expired;

	public Account(String email, String password) {
		this.setEmail(email);

		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());

			this.setPassword(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		;
	}

	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public byte[] getPassword() {
		return password;
	}

	/**
	 * @param bs
	 *            the password to set
	 */
	public void setPassword(byte[] bs) {
		this.password = bs;
	}

	/**
	 * @return the created
	 */
	public Timestamp getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Timestamp created) {
		this.created = created;
	}

	/**
	 * @return the state
	 */
	public Byte getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(Byte state) {
		this.state = state;
	}

	/**
	 * @return the expired
	 */
	public Timestamp getExpired() {
		return expired;
	}

	/**
	 * @param expired
	 *            the expired to set
	 */
	public void setExpired(Timestamp expired) {
		this.expired = expired;
	}

}
