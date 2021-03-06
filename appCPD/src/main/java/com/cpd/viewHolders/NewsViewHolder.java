/*
 * Copyright 2016 Universidade Federal do Rio Grande do Sul
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cpd.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cpd.ufrgsmobile.R;

/**
 * View holder for News List
 *
 * @author Alan Wink
 * @author Theodoro Mota
 * @version 2.0
 */
public class NewsViewHolder extends RecyclerView.ViewHolder {

    public ImageView postThumb;
    public TextView postTitleLabel;
    public TextView postDateLabel;

    public NewsViewHolder(View itemView) {
        super(itemView);
        postThumb = (ImageView) itemView.findViewById(R.id.news_list_item_thumb_image);
        postTitleLabel = (TextView) itemView.findViewById(R.id.news_list_item_title);
        postDateLabel = (TextView) itemView.findViewById(R.id.news_list_item_date);
    }

}