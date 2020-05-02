package id.radenyaqien.roomdatabase.Model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY Word ASC")
    fun getAlpabetWords():LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Insert(word:Word)

    @Query("DELETE FROM word_table")
    suspend fun DeleteAll()


}