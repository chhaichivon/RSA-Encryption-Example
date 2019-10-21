package com.chhaichivon.rsaencryption;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

/**
 * @author: Chhai Chivon on 9/24/2019
 * Digital Channel System Officer
 */

public class RSATest {

    public static void main(String[] args) throws Exception {


      /*  KeyPair keyPair  = RSAUtils.generateKeyPair();

        String publicKey = RSAUtils.getPublicKey(keyPair.getPublic());
        String privateKey  = RSAUtils.getPrivateKey(keyPair.getPrivate());

        System.out.println("public key => "+ publicKey);
        System.out.println("private key => "+ privateKey);
*/
       /* //Our secret message
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
        System.out.println("Signature correct: " + isCorrect);*/




        /*PublicKey publicKey1 = RSAUtils.getPublicKey(publicKey);
        if(publicKey1 != null){
            System.out.println("publicKey1 key => "+ Base64.getEncoder().encodeToString(publicKey1.getEncoded()));
        }else{
            System.out.println("publicKey1 key => Error ");
        }

        PrivateKey privateKey1 = RSAUtils.getPrivateKey(privateKey);
        if(privateKey1 != null){
            System.out.println("privateKey1 key => "+ Base64.getEncoder().encodeToString(privateKey1.getEncoded()));
        }else{
            System.out.println("privateKey1 key => Error ");
        }*/


        System.out.println("TYXj3ZlbW/Y4I8tDn368Fhlf+nEpzQ9TKH/KFJ7Iia0WSeDZrn8DVuEuXx9i09ni8bSNLBsuJJkizWIy18YoZ7gtXiwi0KWOlVomm/jB2Ar/jx5kQKfgp5GEoj9WkV1WCopb/djgB4NbYiVvQRTHz3/jcKURp1xP5DQdiVaIkn3hUW2ZjlabunN9pOS5YxHqQWjUSXv8N/Qq3S9HD50Z4Foual+2sgSR1cTO///I1thZ6IYhwZBzd0UfqkEsdjeC+5Wefek9eyQhGM6n6KkzM/VSBCgbSCryBJGKiF38tnZzYntrl5PXGQ/VS9D1nBHOqPBTFc10pO+mZnjn/OYWGQ==".length());


        System.out.println("sN7JQ8JWZBST0Ko2FHwlFzrMbs2czToCCrfEHdYR+QCu2mwVscytvlfP3LOv6eUiq+z8JLDPWAUzvcO5RVoeHeSZxaGrYx8T7UmZq/mbdidYUcHlTT2lxcmOngvvrs3p+Xn7ugyIqmBJXyTD/wI4e+0KYuEKyr0gnzp7NihKh92akNbDihd+T5wogElrtzHWaoc1xh46xnmm8ubyzjNcka7RxdJ0HSr2cA8fCnO4VuNquz55cxTg5jsggAKo5xaC+SeiAe/96tX0lky0SGVu6I8yLDjJkJOLtHChQVKi/LaR0fWPOnEikHlypgA4873PgaSE3tlOm2ml/3Ef2r8PWw==".length());




        System.out.println("SEC " + "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDFrNZMSAKjv6ZFkbEuYmIxOV0Rf3GUFVqNisV8zX/lrZkfDKjX5HwKxLm7cMU9orQod9c2WtDs/y/ZFAY+Su07zgjemUNmcj6bh0RIyugdCYDIm6FSTcVhYG/DGNO71zrgkgKytXBu77xZAK62j0UGPRq46LtFETYRKgP5/oJD6DM0Qrbp4pIfeGmGVcXp4FMYEd/6zipr0nWHNHP4+D5EG3MK1akOQbioID+qEM8+49o4ezr9XxcYkVAcg/PWvdUfE+lZwfBb9wfQZ0WMpHXvvqhdQxiQJZSfksLLemyrHxgZG67axg3qlFVOoBxbsDg54UmTamQSi3qiYz8Iv+GVAgMBAAECggEBAKJkJbyO39RD6kV2tdcELeSAWou4Zccgb76dxTWM4Mf/gC44yTBq3Ng/2tE4iGDlHBmusddObhp0XYt43tQn25Jo5XJw+CTeL763NgqS3nKUTv7+k1241DD193qQF8lVvGGmsZ68XXxVaCa5383MDwlcA2rqjoXj6MXa/V9PjRZY5rL6RX9gTtavZWZQigUbTYtezq75eRlN/PoKLO3hh7cMOUzD3dgT91gnSojCSYD5YXn0AYUz5GUncVvIIqjAB1CIix7LxdyFU5gk4TZW319H3QTKvvKQqKZbxoLnupnneSCFj6KekUcXNT0+r/ApotHYcA0QavshLiEUvAtuB7UCgYEA4d3dwGtuaPuo74IAB+S8W5TMcSBbA7hBSBBc2zYjs1vRo4lF4WGaSCpo1jI0JCV2xrRjSuk8Vq7n+9Ij3gNc6SdLYi5XjbNyOC41O6nBD+qtv3sYcevv4ouSk3hz/NBzbW8hza5fuDD9PvlMKKiu1KKoVSwPDMG1Pb3k9BtXikMCgYEA4Awh2YYf1gJ7bG3C4VsFtBW4k+2uxdIwN/8JW2mwCBF9btzJ5+wr0Ha5RJROh0Kgw8noXNPPK+0LmzCmHRPWdoc9ZpjHeCKFAp5KF5Cs47ceGTHvrBRgGB0jPR128My+OZZZaiXBk9Sf1HiGMQicN/7OoC/fyzlKLQAYpW6DQ0cCgYEAgjnDkx/d5tXCj2Uq02JEX6EpRsha8YgYy43zm8hZSR5Vfq61Bb+ajqU1ENqdSYH4O5Th8t0LFwd9ZanBWE4kEaHASvlhLaga4N1zf9TeJWkviElWzMg15S6H8lLuvQMKqjv7B3XUZoSIXvipun+XXa3y1Di07Kv67YBBM6VYEbUCgYEA0bMJS6t5yLjyBH6HVJ35LKDX7b0dRBKDByYx/9lf5W1ZVZZZdDVcnPVCWqnlBjyadCZa0ed9lMN9hXd3Quf6Z14VXh3JNOw6SkUVXBERgOE3zqUqiolXl7pN7TnSxXcc5JGQhwVntZHhNuDH2MUSUmavxsaIVJH+lzfr2YsiWKkCgYEAxK7cO/LIURcxa+VscFUb0DtWe2eEdKJktBX/8YGeH02/lKE/lFoWRK/Jmah/gEZ4LOOJB30S5d7pLZbVsRg9PqiXUouuAmKq5khkJrRFZnhsE7wRPIZaEVjS3u23uuUFMXLx+Xs+nx4NcVtkuwz4jXrPR9wSkqKCdRt0n/bhquE=".length());



        System.out.println("SEC PUB "+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxazWTEgCo7+mRZGxLmJiMTldEX9xlBVajYrFfM1/5a2ZHwyo1+R8CsS5u3DFPaK0KHfXNlrQ7P8v2RQGPkrtO84I3plDZnI+m4dESMroHQmAyJuhUk3FYWBvwxjTu9c64JICsrVwbu+8WQCuto9FBj0auOi7RRE2ESoD+f6CQ+gzNEK26eKSH3hphlXF6eBTGBHf+s4qa9J1hzRz+Pg+RBtzCtWpDkG4qCA/qhDPPuPaOHs6/V8XGJFQHIPz1r3VHxPpWcHwW/cH0GdFjKR1776oXUMYkCWUn5LCy3psqx8YGRuu2sYN6pRVTqAcW7A4OeFJk2pkEot6omM/CL/hlQIDAQAB".length());
    }
}
