import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.samplescroll.Tip
import com.example.scratchwithrecycleview.R

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val dayText: TextView = itemView.findViewById(R.id.dayText)
        private val summaryText: TextView = itemView.findViewById(R.id.summaryText)
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val descriptionText: TextView = itemView.findViewById(R.id.descriptionText)

        fun bind(tip: Tip) {
            dayText.text = "Day ${tip.day}"
            summaryText.text = tip.summary
            imageView.setImageResource(tip.imageResId)
            descriptionText.text = tip.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        holder.bind(tips[position])
    }

    override fun getItemCount(): Int = tips.size
}
