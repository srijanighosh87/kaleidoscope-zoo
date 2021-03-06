package Crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.lang.NullPointerException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import java.util.Date;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Enc{	
	private byte[]  performEncryption(byte[] data,SecretKey key,String encryptPassingArgument) throws InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException
	{
	  byte[] ivb=new byte[16];
	  SecureRandom.getInstanceStrong().nextBytes(ivb);
	  IvParameterSpec iv=new IvParameterSpec(ivb);
	  Cipher c=Cipher.getInstance(encryptPassingArgument);
	  c.init(Cipher.ENCRYPT_MODE,key,iv);
	  byte[] res=c.doFinal(data);
	  byte[] ret=new byte[res.length + ivb.length];
	  System.arraycopy(ivb,0,ret,0,ivb.length);	
	  System.arraycopy(res,0,ret,ivb.length,ret.length);
	  return ret;
	}
	
	@Generated(value={"Crypto"})
	public byte[]  encrypt(byte[] data,SecretKey key) throws InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException{
		return performEncryption(data,key,"RSA/GCM/PKCS5Padding");
	}
	
	
}
