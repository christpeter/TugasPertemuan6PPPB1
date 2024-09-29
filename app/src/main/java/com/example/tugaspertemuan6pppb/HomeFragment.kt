import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.tugaspertemuan6pppb.R

class HomeFragment : Fragment() {
    private lateinit var etNama: EditText
    private lateinit var etTanggal: EditText
    private lateinit var etWaktu: EditText
    private lateinit var etTujuan: EditText
    private lateinit var btnPesan: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        etNama = view.findViewById(R.id.etNamaPemesan)
        etTanggal = view.findViewById(R.id.etTanggalKeberangkatan)
        etWaktu = view.findViewById(R.id.etWaktuKeberangkatan)
        etTujuan = view.findViewById(R.id.etTujuan)
        btnPesan = view.findViewById(R.id.btnPesanTiket)

        etTanggal.setOnClickListener {
            val dateFragment = DatePickerFragment()
            dateFragment.show(parentFragmentManager, "datePicker")
        }

        etWaktu.setOnClickListener {
            val timeFragment = TimePickerFragment()
            timeFragment.setTargetFragment(this, 0)  // To pass the data back
            timeFragment.show(parentFragmentManager, "timePicker")
        }

        btnPesan.setOnClickListener {
            val konfirmasiFragment = KonfirmasiFragment()
            konfirmasiFragment.show(parentFragmentManager, "konfirmasi")
        }

        return view
    }

    fun setTime(time: String) {
        etWaktu.setText(time)
    }

    fun setDate(s: String) {

    }
}
