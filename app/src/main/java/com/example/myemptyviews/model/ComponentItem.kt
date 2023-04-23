package com.example.myemptyviews.model

data class ComponentItem(
    var name: String,
    var amount: String,
    var kcal: String,
) {
    companion object {

        fun getComponentList(): ArrayList<ComponentItem> {

            var list = ArrayList<ComponentItem>()

            list.add(ComponentItem("Mozzarella", "100 g", "80 kcal"))
            list.add(ComponentItem("Tomato", "100 g", "64 kcal"))
            list.add(ComponentItem("Basil", "5g", "22 kcal"))
            return list
        }
    }
}