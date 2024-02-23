package mx.edu.itson.potros.practica5

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.listView) as ListView

        var adaptador : AdaptadorProductos = AdaptadorProductos(this, menu)
        listView.adapter = adaptador

    }

    fun agregarProductos(option: String?){
        var imagen: ImageView = findViewById(R.id.imageView)
        when(option){

            "Antojitos"->{
                imagen.setImageResource(R.drawable.antojitos)
                menu.add(Product("Taco Tradicional", R.drawable.taco, "Taco Tradicional",
                    2.79  ))
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su " +
                        "carne favorita, servidas con ensalada - Filled with your choice of meat, " +
                        "served with salad.", 5.99  ))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con " +
                        "frijoles, tu carne favorita, lechuga, queso fresco y crema - " +
                        "Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.",
                    10.99 ))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña", 7.99))
                menu.add(Product("Sincronizada", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole", 7.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema", 3.79))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate", 4.59))
                menu.add(Product("Coctel Mixto", R.drawable.coctel, "", 21.99))
                menu.add(Product("Coctel de Camaron", R.drawable.coctel, "Shrimp cocktail", 16.49))
            }

            "Especiales"->{
                imagen.setImageResource(R.drawable.especialidades)
                menu.add(Product("Mojarra Frita", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas", 17.99))
                menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, aguacate y pico de gallo servido con Chips", 6.99))
                menu.add(Product("Botana de Camarones al Mojo de Ajo", R.drawable.botanacamarones, "", 19.99))
                menu.add(Product("Botana de Camarones a la Diabla", R.drawable.botanacamarones, "", 19.99))
                menu.add(Product("Torre de Camarón Negro", R.drawable.botanacamarones, "", 16.99))
                menu.add(Product("Platillos de Camarón al Mojo de Ajo", R.drawable.botanacamarones, "", 18.99))
                menu.add(Product("Platillos de Camarón a la Diabla", R.drawable.botanacamarones, "", 18.99))
            }

            "Combos"->{
                imagen.setImageResource(R.drawable.combinations)
                menu.add(Product("Traditional Taco Combo", R.drawable.combinationtaco, "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles", 6.99))
                menu.add(Product("Mexican Burritos", R.drawable.burritos, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz", 12.99))
                menu.add(Product("Los Portales Burrito", R.drawable.burritosportales, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole", 13.59))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans", 9.99))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans", 9.99))
                menu.add(Product("Burrito Pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice", 9.99))
                menu.add(Product("Fajita Burrito", R.drawable.burritos, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole", 13.59))
                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada", 13.99))
            }

            "Tortas"->{
                imagen.setImageResource(R.drawable.tortas)
                menu.add(Product("Torta Regular", R.drawable.torta, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat", 12.99))
                menu.add(Product("Torta -Milanesa de Res o Pollo", R.drawable.tortamilanesa, "Breaded Steak or Chicken", 13.99))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese", 13.99))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, "Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork.", 13.99))
            }

            "Sopas"->{
                imagen.setImageResource(R.drawable.sopas)
                menu.add(Product("Small Mexican Torta", R.drawable.torta, "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream", 7.39))
                menu.add(Product("Pozole", R.drawable.pozole, "", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "", 5.99))
                menu.add(Product("Caldo de Res", R.drawable.caldores, "", 5.99))
                menu.add(Product("Caldo de Camarón", R.drawable.caldocamaron, "Shrimp soup", 13.99))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 19.99))
            }

            "Drinks"->{
                imagen.setImageResource(R.drawable.drinks)
                menu.add(Product("Soft Drinks 20oz - Sodas 20oz.", R.drawable.sodas, "", 2.99))
                menu.add(Product("Jarritos", R.drawable.jarritos, "", 2.75))
            }
        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var producto = ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.producto = producto
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return producto.size
        }

        override fun getItem(position: Int): Any {
            return producto[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = producto[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.productoImg) as ImageView
            var nombre = vista.findViewById(R.id.productoNombre) as TextView
            var desc = vista.findViewById(R.id.productoDesc) as TextView
            var precio = vista.findViewById(R.id.productoPrecio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista

        }
    }
}