package com.verbosetech1.yoohoo.interfaces;

import com.verbosetech1.yoohoo.models.Message;

/**
 * Created by a_man on 5/14/2017.
 */

public interface OnMessageItemClick {
    void OnMessageClick(Message message, int position);

    void OnMessageLongClick(Message message, int position);
}
