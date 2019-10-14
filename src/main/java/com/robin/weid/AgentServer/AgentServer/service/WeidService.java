package com.robin.weid.AgentServer.AgentServer.service;

import com.webank.weid.protocol.base.CptBaseInfo;
import com.webank.weid.protocol.base.WeIdPrivateKey;
import com.webank.weid.protocol.response.CreateWeIdDataResult;
import com.webank.weid.protocol.response.ResponseData;

import java.util.Hashtable;
import java.util.Map;

public interface WeidService {

    /**
     * createWeIdAndSetAttr creates weId with public and
     *
     * @param publicKey public key
     * @param privateKey private key
     * @return returns the create weId
     */
    ResponseData<String> createWeIdAndSetAttr(String publicKey, String privateKey);

    /**
     * createWeIdWithSetAttr creates weId and set related properties.
     *
     * @return returns the create weId  and public private keys
     */
    ResponseData<CreateWeIdDataResult> createWeIdWithSetAttr();

    /**
     * registerAuthorityIssuer registers on the chain as an authoritative body.
     *
     * @param authorityName the name of the issue
     * @return true is success, false is failure
     */
    ResponseData<Boolean> registerAuthorityIssuer(String issuer, String authorityName);

    /**
     * registCpt registers CPT.
     *
     * @param publisher the weId of the publisher
     * @param privateKey the private key of the publisher
     * @param claim claim is CPT
     * @return returns cptBaseInfo
     */
    ResponseData<CptBaseInfo> registCpt(
            String publisher,
            String privateKey,
            Map<String, Object> claim
    );

    /**
     * saveEvidence uploads the evidence of object to blockchain
     * @param  object Any Object could be used, even though them implement Hashtable interface.
     *                It supports Credential, CredentialWrapper, CredentialPojo recently.
     * @param weIdPrivateKey the private key of the publisher
     */
    ResponseData<Boolean> saveEvidence(Hashtable object, WeIdPrivateKey weIdPrivateKey);


}
