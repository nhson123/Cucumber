package Tranformation;

import cucumber.api.Transformer;

/**
 * Package: Tranformation
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 13.03.2018 2018
 */
public class EmailTranformation extends Transformer<String> {

    @Override
    public String transform(String username){
        return username.concat("@ea.com");
    }
}