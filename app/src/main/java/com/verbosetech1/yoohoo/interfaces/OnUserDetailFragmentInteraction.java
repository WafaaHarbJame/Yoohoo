package com.verbosetech1.yoohoo.interfaces;

import com.verbosetech1.yoohoo.models.Message;

import java.util.ArrayList;

/**
 * Created by a_man on 6/28/2017.
 */

public interface OnUserDetailFragmentInteraction {
    void getAttachments();

    ArrayList<Message> getAttachments(int tabPos);

    void switchToMediaFragment();
}