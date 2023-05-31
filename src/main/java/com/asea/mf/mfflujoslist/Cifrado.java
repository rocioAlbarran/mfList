package com.asea.mf.mfflujoslist;

import java.io.File;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class Cifrado {
	private File privKeyFile = new File("C:\\proyectos\\llaves\\3\\servidor\\public_key.der");
   // private File pubKeyFile = new File("C:\\proyectos\\llaves\\servidor\\publicaS.pem");;
    
    //String pubKeyFilePath="C:\\proyectos\\llaves\\servidor\\publicaS.pem";
    String publKeySFilePath="C:\\proyectos\\llaves\\3\\servidor\\publicS_key.der";
    String privKeySFilePath="C:\\proyectos\\llaves\\3\\servidor\\privateS_key.der";
    
    String privKeyCFilePath="C:\\proyectos\\llaves\\3\\cliente\\privateC_key.der";
    String publKeyCFilePath="C:\\proyectos\\llaves\\3\\cliente\\publicC_key.der";
    
	public String encrypt(String textoPlano) throws Exception
    {
        System.out.println("in Encrypt");
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        System.out.println("1");
       // FileInputStream pubKeyStream = new FileInputStream(pubKeyFile);
        System.out.println("2");
       // byte[] pubKeyBytes = new byte[128]; // 1024 bits
        System.out.println("3");
      //  pubKeyStream.read(pubKeyBytes);
        System.out.println("4");
        //pubKeyStream.close();
        System.out.println("5");
        byte[] pubkeyBytes = Files.readAllBytes(Paths.get(publKeySFilePath));
        X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(pubkeyBytes);
        System.out.println("6 : "+pubkeyBytes.toString());
        PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);
        System.out.println("7");
 
        Cipher cf = Cipher.getInstance("RSA/ECB/NoPadding");
        System.out.println("8");
        cf.init(Cipher.ENCRYPT_MODE, pubKey);
        System.out.println("9");
        System.out.println("3");

        byte[] bytes = cf.doFinal(textoPlano.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.getEncoder().encode(bytes));
    }
 
    public String decrypt(String textoCifrado) throws Exception
    {
    	// this.privKeyFile = new File("../resources/privatesS.key");
        // this.pubKeyFile = new File("../resources/publicaS.pem");
         
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        
        byte[] priKeyBytes = Files.readAllBytes(Paths.get(privKeySFilePath));
        
        PKCS8EncodedKeySpec priKeySpec = new PKCS8EncodedKeySpec(priKeyBytes);
        PrivateKey priKey = keyFactory.generatePrivate(priKeySpec);
 
        Cipher cf = Cipher.getInstance("RSA/ECB/NoPadding");
        cf.init(Cipher.DECRYPT_MODE, priKey);
 
       // byte[] cipher = new byte[128];
        byte[] plain = new byte[128];
 
 
        plain = cf.doFinal(Base64.getDecoder().decode(textoCifrado));
 
        return new String(plain);
    }
    
    public String descifraPubK(String textoCifrado) throws Exception
    {
        System.out.println("in Encrypt");
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        System.out.println("1");
       // FileInputStream pubKeyStream = new FileInputStream(pubKeyFile);
        System.out.println("2");
       // byte[] pubKeyBytes = new byte[128]; // 1024 bits
        System.out.println("3");
      //  pubKeyStream.read(pubKeyBytes);
        System.out.println("4");
        //pubKeyStream.close();
        System.out.println("5");
        byte[] pubkeyBytes = Files.readAllBytes(Paths.get(publKeySFilePath));
        X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(pubkeyBytes);
        System.out.println("6 : "+pubkeyBytes.toString());
        PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);
        System.out.println("7");
 
        Cipher cf = Cipher.getInstance("RSA/ECB/NoPadding");
        System.out.println("8");
        cf.init(Cipher.DECRYPT_MODE, pubKey);
        byte[] plain = new byte[128];
        
        
        plain = cf.doFinal(Base64.getDecoder().decode(textoCifrado));
 
        return new String(plain);
    }
 
    public String cifraPrivK(String textoPlano) throws Exception
    {
    	// this.privKeyFile = new File("../resources/privatesS.key");
        // this.pubKeyFile = new File("../resources/publicaS.pem");
         
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        
        byte[] priKeyBytes = Files.readAllBytes(Paths.get(privKeySFilePath));
        
        PKCS8EncodedKeySpec priKeySpec = new PKCS8EncodedKeySpec(priKeyBytes);
        PrivateKey priKey = keyFactory.generatePrivate(priKeySpec);
 
        Cipher cf = Cipher.getInstance("RSA/ECB/NoPadding");
        cf.init(Cipher.ENCRYPT_MODE, priKey);
        byte[] bytes = cf.doFinal(textoPlano.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.getEncoder().encode(bytes));
       // byte[] cipher = new byte[128];
       
    }
}
