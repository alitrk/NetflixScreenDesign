package com.example.netflixscreendesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixscreendesign.databinding.CardDesignBinding

class ContentAdapter (var mContext: Context, var contentList:List<Contents>)
    : RecyclerView.Adapter<ContentAdapter.CardViewHolder>() {

        inner class CardViewHolder(binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root){
            var binding: CardDesignBinding
            init {
                this.binding = binding
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
            val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
            return CardViewHolder(binding)
        }

        override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
            val content = contentList.get(position)
            val t = holder.binding
            t.imageViewContent.setImageResource(
                mContext.resources.getIdentifier(content.contentImageName,"drawable",mContext.packageName))

        }


        override fun getItemCount(): Int {
            return contentList.size
        }

}