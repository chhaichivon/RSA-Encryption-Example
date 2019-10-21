package com.chhaichivon.rsaencryption;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.KeyPair;

@SpringBootApplication
public class RsaEncryptionExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RsaEncryptionExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		KeyPair keyPair  = RSAUtils.generateKeyPair();

		String publicKey = RSAUtils.getPublicKey(keyPair.getPublic());
		String privateKey  = RSAUtils.getPrivateKey(keyPair.getPrivate());

		System.out.println("public key => "+ publicKey);
		System.out.println("private key => "+ privateKey);

		//Our secret message
		String  myTest  = "Hello world";

		//Encrypt the message
		String encrypt = RSAUtils.encrypt(myTest,keyPair.getPublic());
		System.out.println("encrypt => "+ encrypt);
		//Now decrypt it
		String decrypt = RSAUtils.decrypt(encrypt,keyPair.getPrivate());
		System.out.println("decrypt => "+ decrypt);

		//Let's sign our message
		String signature = RSAUtils.sign(decrypt, keyPair.getPrivate());
		System.out.println("Signature : " + signature);
		//Let's check the signature
		boolean isCorrect = RSAUtils.verify(decrypt, signature, keyPair.getPublic());
		System.out.println("Signature correct: " + isCorrect);
	}
}
