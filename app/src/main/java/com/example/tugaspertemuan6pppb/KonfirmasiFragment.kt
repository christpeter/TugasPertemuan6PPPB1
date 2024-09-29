import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.tugaspertemuan6pppb.R

class KonfirmasiFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_konfirmasi, container, false)

        val btnBatal = view.findViewById<Button>(R.id.btnBatal)
        val btnSetuju = view.findViewById<Button>(R.id.btnSetuju)

        btnBatal.setOnClickListener { dismiss() }

        btnSetuju.setOnClickListener {
            dismiss()

            (activity as? MainActivity)?.showSuccess()
        }

        return view
    }
}
