package com.verbosetech.yoohoo.interfaces;

import com.verbosetech.yoohoo.models.Contact;
import com.verbosetech.yoohoo.models.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    HashMap<String, Contact> getLocalContacts();
}
