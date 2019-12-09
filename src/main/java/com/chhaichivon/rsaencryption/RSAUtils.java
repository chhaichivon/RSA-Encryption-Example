package com.chhaichivon.rsaencryption;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;


/**
 * @author: Chhai Chivon on 9/24/2019
 * Digital Channel System Officer
 */

public class RSAUtils {

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048, new SecureRandom());
        return generator.generateKeyPair();
    }

    public static String getPrivateKey(PrivateKey privateKey){
        return Base64.getEncoder().encodeToString(privateKey.getEncoded());
    }

    public static String getPublicKey(PublicKey publicKey){
        return Base64.getEncoder().encodeToString(publicKey.getEncoded());
    }

    public static PrivateKey getPrivateKey(String publicKey) throws Exception {
        //byte[] keyBytes = Files.readAllBytes(Paths.get(filename));
        byte[] keyBytes = Base64.getDecoder().decode(publicKey.getBytes("utf-8"));
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    public static PublicKey getPublicKey(String privateKey) throws Exception {
        //byte[] keyBytes = Files.readAllBytes(Paths.get(filename));
        byte[] keyBytes = Base64.getDecoder().decode(privateKey.getBytes("utf-8"));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public static String encrypt(String plainText, PrivateKey privateKey) throws Exception {
        Cipher cipherEncrypt =  Cipher.getInstance("RSA");
        cipherEncrypt.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] cipherText = cipherEncrypt.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String decrypt(String cipherText,PublicKey publicKey) throws Exception {
        byte[] bytes = Base64.getDecoder().decode(cipherText);
        Cipher cipherDecrypt = Cipher.getInstance("RSA");
        cipherDecrypt.init(Cipher.DECRYPT_MODE, publicKey);
        return new String(cipherDecrypt.doFinal(bytes), StandardCharsets.UTF_8);
    }

    public static String sign(String plainText, PrivateKey privateKey) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(privateKey);
        privateSignature.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] signature = privateSignature.sign();
        return Base64.getEncoder().encodeToString(signature);
    }

    public static boolean verify(String plainText, String signature, PublicKey publicKey) throws Exception {
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(publicKey);
        publicSignature.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        return publicSignature.verify(signatureBytes);
    }
}
