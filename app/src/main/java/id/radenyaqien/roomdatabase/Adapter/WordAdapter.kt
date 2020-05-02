package id.radenyaqien.roomdatabase.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.radenyaqien.roomdatabase.Model.Word
import id.radenyaqien.roomdatabase.R
import kotlinx.android.synthetic.main.recycleview_item.view.*

class WordAdapter internal constructor(context: Context):
    RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    private val inflater :LayoutInflater = LayoutInflater.from(context)
    private var listWord = emptyList<Word>()

    inner class WordViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        var wordtext :TextView = itemView.findViewById(R.id.rvtextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = inflater.inflate(R.layout.recycleview_item,parent,false)
        return WordViewHolder(itemView)
    }

    override fun getItemCount() = listWord.size


    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = listWord[position]
        holder.wordtext.text = current.word
    }
    internal fun setWords(words: List<Word>) {
        this.listWord = words
        notifyDataSetChanged()
    }
}