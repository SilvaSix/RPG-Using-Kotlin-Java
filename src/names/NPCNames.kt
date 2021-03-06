package names

class NPCNames {

    var npcListOfNames = listOf<String>("Olivia" ,
            "Emily" ,
            "Isla" ,
            "Sophie" ,
            "Ella" ,
            "Ava" ,
            "Amelia" ,
            "Grace" ,
            "Freya" ,
            "Charlotte" ,
            "Jessica" ,
            "Lucy" ,
            "Ellie" ,
            "Sophia" ,
            "Aria" ,
            "Lily" ,
            "Harper" ,
            "Mia" ,
            "Rosie" ,
            "Millie" ,
            "Evie" ,
            "Eilidh" ,
            "Ruby" ,
            "Willow" ,
            "Anna" ,
            "Maisie" ,
            "Hannah" ,
            "Eva" ,
            "Chloe" ,
            "Mila" ,
            "Orla" ,
            "Isabella" ,
            "Ivy" ,
            "Emma" ,
            "Georgia" ,
            "Poppy" ,
            "Robyn" ,
            "Daisy" ,
            "Zara" ,
            "Gracie" ,
            "Holly" ,
            "Skye" ,
            "Esme" ,
            "Sofia" ,
            "Erin" ,
            "Hallie" ,
            "Molly" ,
            "Ayla" ,
            "Emilia" ,
            "Layla" ,
            "Katie" ,
            "Sienna" ,
            "Niamh" ,
            "Alice" ,
            "Amber" ,
            "Bonnie" ,
            "Maya" ,
            "Zoe" ,
            "Ada" ,
            "Hollie" ,
            "Bella" ,
            "Luna" ,
            "Thea" ,
            "Rose" ,
            "Abigail" ,
            "Summer" ,
            "Callie" ,
            "Hope" ,
            "Lexi" ,
            "Iona" ,
            "Elsie" ,
            "Leah" ,
            "Scarlett" ,
            "Julia" ,
            "Violet" ,
            "Myla" ,
            "Harley" ,
            "Eve" ,
            "Imogen" ,
            "Elizabeth" ,
            "Cora" ,
            "Florence" ,
            "Georgie" ,
            "Lilly" ,
            "Matilda" ,
            "Mirren" ,
            "Phoebe" ,
            "Rowan" ,
            "Lola" ,
            "Aurora" ,
            "Evelyn" ,
            "Brooke" ,
            "Clara" ,
            "Lucie" ,
            "Sadie" ,
            "Cara" ,
            "Darcy" ,
            "Nova" ,
            "Penelope" ,
            "Abbie" ,
            "Jack" ,
            "Oliver" ,
            "James" ,
            "Charlie" ,
            "Harris" ,
            "Lewis" ,
            "Leo" ,
            "Noah" ,
            "Alfie" ,
            "Rory" ,
            "Alexander" ,
            "Max" ,
            "Logan" ,
            "Lucas" ,
            "Harry" ,
            "Theo" ,
            "Thomas" ,
            "Brodie" ,
            "Archie" ,
            "Jacob" ,
            "Finlay" ,
            "Finn" ,
            "Daniel" ,
            "Joshua" ,
            "Oscar" ,
            "Arthur" ,
            "Hunter" ,
            "Ethan" ,
            "Mason" ,
            "Harrison" ,
            "Freddie" ,
            "Ollie" ,
            "Adam" ,
            "William" ,
            "Jaxon" ,
            "Aaron" ,
            "Cameron" ,
            "Liam" ,
            "George" ,
            "Jamie" ,
            "Callum" ,
            "Matthew" ,
            "Muhammad" ,
            "Caleb" ,
            "Nathan" ,
            "Tommy" ,
            "Carter" ,
            "Blake" ,
            "Andrew" ,
            "Luke" ,
            "Jude" ,
            "Angus" ,
            "Riley" ,
            "Luca" ,
            "Samuel" ,
            "Joseph" ,
            "David" ,
            "Isaac" ,
            "Ryan" ,
            "Hamish" ,
            "Sonny" ,
            "Arlo" ,
            "Arran" ,
            "Cole" ,
            "Robert" ,
            "Blair" ,
            "Dylan" ,
            "Louie" ,
            "Ruaridh" ,
            "Connor" ,
            "Benjamin" ,
            "Kai" ,
            "Michael" ,
            "Jackson" ,
            "Leon" ,
            "Cooper" ,
            "Louis" ,
            "Theodore" ,
            "Fraser" ,
            "Owen" ,
            "Reuben" ,
            "John" ,
            "Carson" ,
            "Innes" ,
            "Elijah" ,
            "Murray" ,
            "Grayson" ,
            "Aiden" ,
            "Aidan" ,
            "Cody" ,
            "Elliot" ,
            "Ben" ,
            "Henry" ,
            "Ayden",
            "Avery",
            "Ayla",
            "Ava",
            "Valaire",
            "Eve",
            "Spence" ,
            "Timmy" ,
            "Bobby" ,
            "Billy Bob" ,
            "Jones" ,
            "Karen" ,
            "Scooter",
            "DaBaby"
            )


        fun randomNpcName(): String {
                val lengthOfList = npcListOfNames.size - 1
                var randomNamePosition: Int = (0..lengthOfList).random()
                return npcListOfNames.elementAt(randomNamePosition)
        }

}