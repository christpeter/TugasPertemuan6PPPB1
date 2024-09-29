import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.tugaspertemuan6pppb.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }
    }

    fun showSuccess() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, SuccessFragment())
            .addToBackStack(null)
            .commit()
    }
}

private fun FragmentTransaction.replace(
    fragmentContainer: Int,
    successFragment: SuccessFragment
): FragmentTransaction {
    TODO("Not yet implemented")
}

class SuccessFragment : Fragment() {

}

open class Fragment {

}


