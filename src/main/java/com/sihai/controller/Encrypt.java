package com.sihai.controller;


import com.sihai.crypt.encrypt.RSAUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @Author:zhao-baolin
 * @Description:
 * @Date:Created in 2018/7/4
 * @Modified By:
 */
@Controller
public class Encrypt {

    @RequestMapping("/encrypt")
    @ResponseBody
    public void encrypt(String[] args) throws Exception {
        String source = "今天天气真好";

        //公钥加密
        PublicKey publicKey = RSAUtil.getPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjygJfqM6+X2sS+WKtyYr5Zs0J16+bDMy\n" +
                "Omgm8lU3BgQtZRV3DlMex0AFA6zy3Nyn54/0IXiy66NzFYRTzVx1IyVHwaAbIu6HbdKnUUcJebrd\n" +
                "ZjkcaVw3OFACyDvrH/ZyeaNIOT9p8JktMpVV8ZPLCcc/0ZLa6VGRDTLVyfD16E1euLMb1AdnXAGG\n" +
                "KSmtg/1QKToXeiFN7rqSRim3FfbsQIMaYHk4kcdi5TRv6jSK3ZGiNPIGkn4VHu7dEldbU7AkBn2R\n" +
                "900L/ZWnPpteWD9ASws5qxZVQ5KRbE4d5idipLDrVesUxZ9QnNgJ0tYVqur6GwUvS316basjSZUl\n" +
                "u18fRwIDAQAB");

        String encript = RSAUtil.encryptString(publicKey, source);
        System.out.println("加密后数据：" + encript);

        //私钥解密
        PrivateKey privateKey = RSAUtil.getPrivateKey("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCPKAl+ozr5faxL5Yq3JivlmzQn\n" +
                "Xr5sMzI6aCbyVTcGBC1lFXcOUx7HQAUDrPLc3Kfnj/QheLLro3MVhFPNXHUjJUfBoBsi7odt0qdR\n" +
                "Rwl5ut1mORxpXDc4UALIO+sf9nJ5o0g5P2nwmS0ylVXxk8sJxz/RktrpUZENMtXJ8PXoTV64sxvU\n" +
                "B2dcAYYpKa2D/VApOhd6IU3uupJGKbcV9uxAgxpgeTiRx2LlNG/qNIrdkaI08gaSfhUe7t0SV1tT\n" +
                "sCQGfZH3TQv9lac+m15YP0BLCzmrFlVDkpFsTh3mJ2KksOtV6xTFn1Cc2AnS1hWq6vobBS9LfXpt\n" +
                "qyNJlSW7Xx9HAgMBAAECggEAQ62S54q1y9NtDCiFrtZd9FuuiVpSPgbqHRC2MOS2caKx71L5iQ0k\n" +
                "xN/wPu+ZlW6/9kppCRXtyFbqhmab0799JVNvnAtcKOSJpBLtxRAHW8RK/RPM6caN2JKC7jTdkKvL\n" +
                "LNRTxbTEGdngs0REcEQFviazdhmuYpWMNKguyByhtOOB+6DhQwGqCciD6+org8GWACHSSjB8AAfp\n" +
                "10KRdanUG9P/DyPCyhZFmsFs8RVoeKmQzLp78SsQBWtnnQ95JkExy6nSCXKmdX0HhtQrNikQA6Gc\n" +
                "6Rt/MWt1wtZwZodXMRy2zZxaeYcQiHKwxLDOAnykaeJHd9mqub2D9D3DM4N2KQKBgQDBBuwEZ/dX\n" +
                "DnOfCHJjO0VPgDO/xQq5IxlSY2g3fgCBb2ezCczLB/YqucPIS6gmQzqYuhM1MxM67nk4MydY4M21\n" +
                "grS0TGZRdlK9PDaJJ14wQRO1/OlIYT1VuSi2bMd/7V1ZiNI1LsRkcA5zYzC1T3gB56qqVglgB48N\n" +
                "l3dDHxo2jQKBgQC93A78OPvnD4W96REPSiwRu6zH5ZVPtSXoFgN8Xoj/YZHEKu7PZtuTMs9fE+pq\n" +
                "rv8FIaPohOWALkyrZ1icN8meY7IlbyxuwlwU84P1J/yAVIPbvLb7zlcftCLOyjWsoBv83X0lxdLV\n" +
                "PfSNJVPV1zWJt5L9xf330Qix6RC6PLLSIwKBgQCv7TIhVex9gONqV9WBkZy7N7pylxEN6eqDR6zN\n" +
                "nt6xGatm55Cqn2gCSusg26u2q+F1H2qwOwvU01LSIPVEsSdrvmQaS+OZbYE9jeqamLHkwvtHC+pG\n" +
                "mLHBNo/frEcr1lgVaXlFFYnTjLnu+sGDDpnvColm1CGZT2pXVexR1cAbZQKBgAgobHxp9mj3Qcfn\n" +
                "O9RsW3hnmAT+2GuUXQyb5YpyhXBzwM+tCJXg1Y59oGt1b50l589Qorpa+4GGe8Thq+0KeJ9VqVHy\n" +
                "dPZNY6eCzyi5jx/0gbXvZe1r8FJsaxJ3ndbNCmbTHY2B8o03HEr0T6XgmWxRdv9wgnkjgjwix5U5\n" +
                "BnYBAoGAUoXYkcEEbonE327QFtKyqAcua4NIKjeaRzeb2YZz/B2U6KU11jrPK6eBFbwLSWVv+E0s\n" +
                "3bCSkNjWjwbrfl4nIshRVTvI1qfQy9IWxVT8O1wey2Nd7eD1M4Ceao1EERkQ0hiBVPajG7Ek0bJ8\n" +
                "WNoBJckrXLeWrmbexKxQ7z8PpI8=");
        String oldSource = RSAUtil.decryptString(privateKey, encript);
        System.out.println("解密后数据:" + oldSource);
    }


    public static void main(String[] args) throws Exception {
        String source = "今天天气真好";

        //公钥加密
        PublicKey publicKey = RSAUtil.getPublicKey("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALBJo2ROElB+AFK2fUjsNdCHWmZ/s37e8rqO+ctbc78c\n" +
                "qfJfbVfmvtJ8Z0djIOP7FzGCxUAcvgTc4py2W92VCkMCAwEAAQ==");

        String encript = RSAUtil.encryptString(publicKey, source);
        System.out.println("加密后数据：" + encript);

        //私钥解密
        PrivateKey privateKey = RSAUtil.getPrivateKey("MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAsEmjZE4SUH4AUrZ9SOw10IdaZn+z\n" +
                "ft7yuo75y1tzvxyp8l9tV+a+0nxnR2Mg4/sXMYLFQBy+BNzinLZb3ZUKQwIDAQABAkAfwRPydHGu\n" +
                "GBQ80exdX1cOOeNZxTTy7HvyiOCL9ewyh0yhJZelwcgCxILvklvzMP8HKU36kK5TQkfHa1p+okqZ\n" +
                "AiEA+4Qaqz1+VVpS7Oz1LYNapaN7LbOj9bRMP8v97wOBgbUCIQCzbjLfODHbEan46Mo2TzFMqfmw\n" +
                "OtqnDNPLvieRAJK3FwIhAOutc9f1vUV5Z67+sxc8uFnxgGDorcB0e+Zj3cRzgozpAiBoWmfFwKXm\n" +
                "NZC4DZNFIKuYXaa0opX135TyAqZ6Q24QgwIgVng82JA/gXUGc6EQOQ0rFTTQ7IhE/3oYRLqGTxkd\n" +
                "FDk=");
        String oldSource = RSAUtil.decryptString(privateKey, encript);
        System.out.println("解密后数据:" + oldSource);
    }
}
