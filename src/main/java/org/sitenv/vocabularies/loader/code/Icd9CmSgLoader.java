package org.sitenv.vocabularies.loader.code;

import org.springframework.stereotype.Component;

/**
 * Created by Brian on 2/7/2016.
 */
@Component(value = "ICD9CM_SG")
public class Icd9CmSgLoader extends Icd9BaseLoader {
    @Override
    protected void setOID(String oid) {
        oid = CodeSystemOIDs.ICD9CMSG.codesystemOID();
    }
}
