package com.geeks.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf<CarModel>()
    private lateinit var carAdapter: CarAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initView()
    }

    private fun initView() {
        carAdapter = CarAdapter(list)
        binding.rvAnimal.adapter = carAdapter
    }

    private fun loadData() {
        list = arrayListOf<CarModel>(CarModel(
            img="https://prod.cosy.bmw.cloud/bmwusa/cosySec?COSY-EU-100-5758o7q0grOJY3szwVv5aSa0%251NS%25Xt6HJdI0InIjqgaLk80z5tRYeYW43fqxBiW8mqIlLlEinuGh79GcaB2RdRM1gXiK34SoJVpr9g9zFEnlg6GigDWTVFw4icXb6CJNGToaFMUNkb5%25CZzBZaSvMJw8K%25pNZU9lqvAYJznNxN7KUwfYLYelzI2qsKrhwE0hOlLRIDmfDh8uEcWImRdGDTk04uikcbtmMGOtTaBWAk1Bb%25sUUtjsavdoUB4q%25NiaAsyxvY2prqP3NK0IUxQ9YlmHe3HnKhkbd9g9wEIRVAK8DgoXtjtLULqjBiW6sZxny2bl%25vb5bzbZtzxNQysjKja5bA%254vZF79g9LCkTFj6w%25MxM9fQ7kG9oB4BZHlw5sysxghIHHQZ",
            title="X2 Coupe SUV",
            price = "44 300",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
            img="https://prod.cosy.bmw.cloud/bmwusa/cosySec?COSY-EU-100-6634bz50LuvKhRw0kJDurFunFt5j%25BMtcw5dZtXM06Yu7DRgY5aA7VhqfVO2GEhHQfaAAglgBgWBTG6SNIEUpHKdthiiwwKPpQaDMWjaXhYxUnu0pr8MBCj8R%25NnQ9RbaELCtF1A6mv9P3hTTIrFk6OpYw%253yxlc2xe6GViSExax4qKfDw7VugdMmlbqjsYn%25MAgRH8CjjTs1BN9UGpHhQLFERcBOtvNvDSQlPrLbCDtik%25mvq5PKyeUe6EkdGa0dUoyY47deWIGrDFdOvdb3pY80cBdgU0UYSjq5Qh0BWUfqTC8MkzCS1hnImuegb0r6R5Fso%25FnIGri4JSYgyOLuX6NwKPkTIJSQY7tWb2Dt8XPzAlIQj",
            title="X3 SUV",
            price = "50 900",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
            img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=25XR&client=byo&paint=P0300&fabric=FKHSW&sa=S01X8,S0225,S02TB,S0302,S0319,S03AG,S0402,S0420,S0423,S0430,S0459,S0481,S0493,S0494,S04K1,S04U0,S04UR,S0534,S0552,S05AC,S05AS,S05AV,S0676,S06AC,S06AK,S06C4,S06U3,S0775&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
            title="X4 Coupe SUV",
            price = "55 300",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://prod.cosy.bmw.cloud/bmwusa/cosySec?COSY-EU-100-5758o7q0grOJY3szwVv5aSa0%251NS%25Xt6HJdI0InIjqgaLk80z5tRYeYW43fqxBiW8mqIlLlEinuGh79GcaB2RdRM1gXiK34SoJVpr9g9zFEnlg6GigDWTVFw4icXb6CJNGToaFMUNkb5%25CZzBZaSvMJw8K%25pNZU9lqvAYJznNxN7KUwfYLYelzI2qsKrhwE0hOlLRIDmfDh8uEcWImRdGDTk04uikcbtmMGOtTaBWAk1Bb%25sUUtjsavdoUB4q%25NiaAsyxvY2prqP3NK0IUxQ9YlmHe3HnKhkbd9g9wEIRVAK8DgoXtjtLULqjBiW6sZxny2bl%25vb5bzbZtzxNQysjKja5bA%254vZF79g9LCkTFj6w%25MxM9fQ7kG9oB4BZHlw5sysxghIHHQZ",
                title="X1 SUV",
                price = "42 800",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=25SP&client=byo&paint=P0300&fabric=FMAH7&sa=S01RF,S0302,S0319,S0322,S03AG,S03MC,S0402,S0420,S0423,S0493,S04MC,S0552,S05AS,S05AV,S0688,S06AC,S06AK,S06C4,S06U3&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X4 M Coupe SUV",
                price = "79 100",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=26XO&client=byo&paint=P0300&fabric=FKPSW&sa=S01CE,S01SF,S0255,S02TB,S0302,S0319,S0322,S03AT,S03MB,S0402,S0420,S0423,S0459,S0481,S0494,S04FL,S04KR,S04T8,S04UR,S0552,S05AC,S05AS,S05DM,S0676,S06AC,S06AK,S06C4,S06CP,S06NX,S06U2,S0775&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X5 SUV",
                price = "67 600",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=26XK&client=byo&paint=P0300&fabric=FLKSW&sa=S01CE,S01MA,S01TE,S0302,S0319,S0322,S03MC,S03MF,S0402,S0420,S0423,S0459,S04FL,S04GQ,S04HB,S04MA,S04MC,S04NB,S0552,S05AC,S05AS,S05DW,S0688,S06AC,S06AK,S06C4,S06CP,S06NX,S06U3,S0776,S07M9&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X5 M Competition SUV",
                price = "129 700",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=26XL&client=byo&paint=P0300&fabric=FKPSW&sa=S01CE,S01TD,S02VF,S0302,S0319,S0322,S03DZ,S0402,S0420,S0423,S0459,S0481,S0494,S04FL,S04KR,S04T8,S04UR,S0552,S05AC,S05AS,S05DM,S0676,S06AC,S06AK,S06C4,S06CP,S06NX,S06U2,S0710,S0715,S0760,S0775&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X6 Coupe SUV",
                price = "76 400",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=26XN&client=byo&paint=P0300&fabric=FLKSW&sa=S01CE,S01EZ,S01MA,S0302,S0319,S0322,S03MF,S0402,S0420,S0423,S0459,S04FL,S04GQ,S04HB,S04MA,S04MC,S04NB,S0552,S05AC,S05AS,S05DW,S0688,S06AC,S06AK,S06C4,S06CP,S06NX,S06U3,S0776,S07M9&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X6 M Competition SUV",
                price = "134 600",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://cache.bmwusa.com/cosy.arox?pov=walkaround&brand=WBBM&vehicle=26SA&client=byo&paint=P0300&fabric=FKPSW&sa=S01CE,S01XK,S0255,S02TB,S0302,S0319,S0322,S03AT,S03MB,S0418,S0420,S0423,S0456,S04FL,S04HB,S04KR,S04UR,S05AC,S05AS,S05DW,S0676,S06AC,S06AK,S06C4,S06NX,S06U3&quality=70&bkgnd=transparent&resp=png&angle=60&w=10000&h=10000&x=0&y=0",
                title="X7 SUV",
                price = "86 700",type="Luxury", transmission = "Automatic Transmission", ac = "Yes"),
            CarModel(
                img="https://prod.cosy.bmw.cloud/bmwusa/cosySec?COSY-EU-100-7331BdOayVhjujzMhxZemlDdroRMy2o3eED89RMQHOWD6P05qKkwdnuVnBLVN9cv7iVQkIVUMMDqAusWpC9QFe0foM6q%257Gq7zA54Crmq5UrOrJrlCGw6ZuLiqptYRSJyH67m5VKdTYCygNWusmlTv0PGdyX324bYiTQdjc9qh3azDxTY7dnkq83mHzOALUdbskIFJGzYfABKupkHwFeWS6AcRKMPVYFxGWhbNmKWjPo90yWcvbHi4TPo09%25wc3bO9iftxdYrxw178zmZ1tECUkyih7slGAn5GCrXpFOgVlZQ6KI01XRaYWBjwQ5nmPeBTagOybMfunvIT9JdpO2kYW4GYKTgXASHCrmaOd8ql6JexuUtJCgR2jzOS1%25uC65eSQLqTMpk%25C1LB9rrO2kHxEa6S4YuzHACpLFUtOPoxG2aKkrgMLWQpRB%255U3",
                title="XM SUV",
                price = "159 600",type="Luxury", transmission = "Automatic Transmission", ac = "Yes")
        )
    }
}