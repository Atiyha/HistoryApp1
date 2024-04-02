package com.example.historyapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.histprac.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGen = findViewById<Button>(R.id.btnGen)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val viewDisplay = findViewById<TextView>(R.id.viewDisplay)
        val edtAge: EditText = findViewById(R.id.edtAge)
        var people: String = " "

        btnClear.setOnClickListener { resetApp() }

        btnGen.setOnClickListener {
            val edtAgeText = edtAge.text.toString()

            if (edtAgeText.isNotEmpty()) {
                val age = edtAgeText.toIntOrNull()
                if (age != null && age in 21..99) {
                    if (age in 21..25) {
                        people = "You are ${edtAge.text} years old, which is around/is the same age as Aaliyah. Aaliyah was an actress and singer. Better known as the Princess of R&B."
                    } else {
                        // Handle other age cases if needed
                        if (age in 26..29) { // if statement for age being more than equal to 26 and less than equal to 29
                            people =
                                "You are ${edtAge.text} years old, which is around/is the same as Avicii. Avicii was a record producer, Dj and song writer in the genres EDM, Progressive house and electro house."
                        } else {
                            if (age in 30..35) { // if statement for age being more than equal to 30 and less than equal to 35
                                people =
                                    "You are ${edtAge.text} years old, which is around the same age as Princess Diana of Whales. Princess Diana was a member of the British Royal family, and was the first wife of King Charles III."
                            } else {
                                if (age in 36..39) { // if statement for age being more than equal 36 and less then equal to 39
                                    people =
                                        "You are ${edtAge.text} years old, which is around the same age Vincent Van Gogh. Vincent Van Gogh was a Dutch post-impressionist painter. Most famous for his paintings of The Starry Night, Sunflowers and The Potato Eaters."
                                } else {
                                    if (age in 40..45) { // if statement for age being more than equal to 40 and less than equal to 45
                                        people =
                                            "You are ${edtAge.text} years old, which is around the same age as Chadwick Boseman. Chadwick was an American actor, famously known for his role in Marvel's Black Panther."
                                    } else {
                                        if (age in 46..49) { // if statement for age being more than equal to 46 and less then equal to 49
                                            people =
                                                "You are ${edtAge.text} years old, which is around the same age as John F Kennedy. JFK was the 35th President of the United States. He was the youngest American President to die."
                                        } else {
                                            if (age in 50..55) { // if statement for age being more than equal to 50 and less than equal to 55
                                                people =
                                                    "You are ${edtAge.text} years old, which is the same age as Michael Jackson, better known as The King of Pop. He is the most iconic musician of the 20th century."
                                            } else {
                                                if (age in 56..59) { // if statement for age being more than equal to 56 and less than equal to 59
                                                    people =
                                                        "You are ${edtAge.text} years old, which is the same age as Abraham Lincoln, who was the 16th President of the United States. "
                                                } else {
                                                    if (age in 60..65) { // if statement for age being more than equal to 60 and less than equal to 65
                                                        people =
                                                            "You are ${edtAge.text} years old, which is the same age as Theodore Roosevelt, who was the 26th President of the United States, as well as the youngest President in the American History. "
                                                    } else {
                                                        if (age in 66..69) { // if statement for age being more than equal to 66 and less than equal to 69
                                                            people =
                                                                "You are ${edtAge.text} years old, which is the same age as Akira Toriyama. Akira was a Japanese manga artist and character designer. Mainly known for his creation of Dragon Ball and Dr. Slump."
                                                        } else {
                                                            if (age in 70..75) { // if statement for age being more than equal 70 and less than equal 75
                                                                people =
                                                                    "You are ${edtAge.text} years old, which is the same age as Louis Vuitton, a French fashion designer and businessman, and founder of the famous brand of leather goods."
                                                            } else {
                                                                if (age in 76..79) { // if statement for age being more than equal 76 and less than equal 79
                                                                    people =
                                                                        "You are ${edtAge.text} years old, which is the same age as Albert Einstein. Einstein was a German-born theoretical physicist, known for developing the theory of relativity and his assistance in quantum mechanics."
                                                                } else {
                                                                    if (age in 80..85) { // if statement for age being more than equal 80 and less than equal 85
                                                                        people =
                                                                            "You are ${edtAge.text} years old, which is the same age as P. T. Barnem. He was an American Showman, businessman and politician, remembered for founding the Barnem and Bailey Circus."
                                                                    } else {
                                                                        if (age in 86..89) { // if statement for age being more than equal 86 and less than equal 89
                                                                            people =
                                                                                "You are ${edtAge.text} years old, which is the same age as Dr. Seuss. Dr. Seuss was an American children's author and cartoonist, most commonly known for his books, The Cat in The Hat, The Lorax and How the Grinch Stole Christmas."
                                                                        } else {
                                                                            if (age in 90..95) { // if statement for age being more than equal 90 and less than equal 95
                                                                                people =
                                                                                    "You are ${edtAge.text} years old, which is the same age as Pablo Picasso, a Spanish multi-media artist. He is one of the influential artists of the 20th century. "
                                                                            } else {
                                                                                if (age in 96..99) { // if statement for age being more than equal 96 and less than equal to 99
                                                                                    people =
                                                                                        "You are ${edtAge.text} years old, which is the same age as former Queen, Elizabeth II. She was the Queen of the United Kingdom and her reign over 70 years is the longest of any British Monarch."
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Toast.makeText(this@MainActivity, "Please enter an age between 20 and 100", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this@MainActivity, "Please enter your age", Toast.LENGTH_LONG).show()
            }

            viewDisplay.text = people
        }



    }

    private fun resetApp(){
        val intent = Intent(this, MainActivity :: class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}