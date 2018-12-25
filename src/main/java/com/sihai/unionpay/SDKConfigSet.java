package com.sihai.unionpay;

/**
 * SDKConfigSet
 *
 * @author virgilin
 * @date 2018/11/21
 */
public class SDKConfigSet {
    private static SDKConfig sdkConfig = SDKConfig.getConfig();
    public static void setSdkConfig(String signCertPwd,String backUrl,String frontUrl,String signCertPath,String encryptCertPath,String middleCertPath,String rootCertPath){
        sdkConfig.setSignCertPwd(signCertPwd);
        sdkConfig.setBackUrl(backUrl);
        sdkConfig.setFrontUrl(frontUrl);
        sdkConfig.setSignCertPath(signCertPath);
        sdkConfig.setEncryptCertPath(encryptCertPath);
        sdkConfig.setMiddleCertPath(middleCertPath);
        sdkConfig.setRootCertPath(rootCertPath);
    }

}
