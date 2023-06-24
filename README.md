# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Prototype Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي object من class فيه داتا و عايز اعمل object تاني بنفس الداتا بالظبط لكن يكون منفصل عنه (يعني لما اغير في ال object الاول التأثير مايحصلش لل object التاني و العكس)
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال Person Abstract Class و ده هيكون ال Parent بتاع ال Employee و ال Student و بيفرض عليهم انهم يعملوا implementation لل clone function
  - ال Student Class و ده بيعمل Extend لل Person Class و بيعمل implementation لل clone function
  - ال Employee Class و ده بيعمل Extend لل Person Class و بيعمل implementation لل clone function
