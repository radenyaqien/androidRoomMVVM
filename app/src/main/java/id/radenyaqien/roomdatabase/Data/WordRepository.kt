package id.radenyaqien.roomdatabase.Data

import androidx.lifecycle.LiveData
import id.radenyaqien.roomdatabase.Model.Word
import id.radenyaqien.roomdatabase.Model.WordDao

class WordRepository(private val wordDao : WordDao) {

    val AllWords : LiveData<List<Word>> = wordDao.getAlpabetWords()

    suspend fun Insert(word: Word){
        wordDao.Insert(word)
    }
}