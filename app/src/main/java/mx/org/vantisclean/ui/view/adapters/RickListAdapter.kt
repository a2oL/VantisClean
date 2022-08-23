import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mx.org.vantisclean.R
import mx.org.vantisclean.data.model.RickModel
import mx.org.vantisclean.ui.view.DetailActivity

class RickListAdapter : RecyclerView.Adapter<RickListAdapter.ViewHolder>() {
    var ricksModel: List<RickModel>  = ArrayList()
    lateinit var context: Context
    fun RickListAdapter(ricksPeople : List<RickModel>, context: Context){
        this.ricksModel = ricksPeople
        this.context = context
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = ricksModel.get(position)
        holder.bind(item, context)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.rick_item_list, parent, false))
    }
    override fun getItemCount(): Int {
        return ricksModel.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val rickName = view.findViewById(R.id.txt_rick_name) as TextView
        val rickImage = view.findViewById(R.id.img_rick) as ImageView

        fun bind(ricksPerson:RickModel, context: Context){
            rickName.text = ricksPerson.name
            Glide.with(context).load(ricksPerson.image).into(rickImage);
            itemView.setOnClickListener(View.OnClickListener {
                val intento1 = Intent(context, DetailActivity::class.java)
                intento1.putExtra("imagen", ricksPerson.image)
                intento1.putExtra("name", ricksPerson.name)
                intento1.putExtra("gender", ricksPerson.gender)
                intento1.putExtra("species", ricksPerson.species)
                intento1.putExtra("status", ricksPerson.status)
                intento1.putExtra("type", ricksPerson.type)
                context.startActivity(intento1)
                Toast.makeText(context, ricksPerson.name, Toast.LENGTH_SHORT).show()
            })
        }
    }
}