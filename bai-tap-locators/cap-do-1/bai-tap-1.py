#ViTriSo1
"vi-tri-so-1-cach-1" = "//a[contains(@class,'active')]"
"vi-tri-so-1-cach-2" = "//a[contains(@href,'viewAdminModule')]"
"vi-tri-so-1-cach-3" = "//span[text()='Admin']//parent::a" # Best Choice

#ViTriSo2
"vi-tri-so-2-cach-1" = "//a[contains(@href,'viewPimModule')]"
"vi-tri-so-2-cach-2" = "//span[text()='PIM']//parent::a" # Best Choice

#ViTriSo3
"vi-tri-so-3-cach-1" = "//a[contains(@href,'viewLeaveModule')]"
"vi-tri-so-2-cach-2" = "//span[text()='Leave']//parent::a" # Best Choice

#ViTriSo4
"vi-tri-so-4-cach-1" = "//label[text()='Username']//parent::div//following-sibling::div/input"
"vi-tri-so-4-cach-2" = "//label[text()='Username']//following::input[1]" # Best Choice

#ViTriSo5
"vi-tri-so-5-cach-1" = "//label[text()='User Role']//parent::div//following-sibling::div//div[contains(@class, 'select-text--active')]" # Best Choice
"vi-tri-so-5-cach-2" = "//label[text()='User Role']//parent::div//following-sibling::div/div/div"

#ViTriSo6
"vi-tri-so-6-cach-1" = "//label[text()='User Role']//following::span[text()='Admin']" # Best Choice
"vi-tri-so-6-cach-2" = "//label[text()='User Role']//following::span[1]" # Trong trường hợp lấy bất kỳ role (không quan tâm giá trị, chỉ cần lấy giá trị đầu tiên get được)

#ViTriSo7
"vi-tri-so-7-cach-1" = "//label[text()='User Role']//following::span[text()='ESS']" # Best Choice
"vi-tri-so-7-cach-2" = "//label[text()='User Role']//following::span[2]" # Trong trường hợp lấy bất kỳ role (không quan tâm giá trị, chỉ cần lấy giá trị thứ hai get được)

#ViTriSo8
"vi-tri-so-8-cach-1" = "//label[text()='Employee Name']//parent::div//following-sibling::div//input" # Best Choice
"vi-tri-so-8-cach-2" = "//input[@placeholder='Type for hints...']"

#ViTriSo9
"vi-tri-so-9-cach-1" = "//button[contains(@class,'ghost')]"
"vi-tri-so-9-cach-2" = "//button[text()=' Reset ']"
"vi-tri-so-9-cach-3" = "//button[contains(.,'Reset')]" # Best Choice

#ViTriSo10
"vi-tri-so-10-cach-1" = "//button[text()=' Search ']"
"vi-tri-so-10-cach-2" = "//button[contains(.,'Search')]" # Best Choice

#ViTriSo11
"vi-tri-so-11-cach-1" = "//nav//span[contains(.,'User Management')]"
"vi-tri-so-11-cach-2" = "//span[contains(.,'User Management') and contains(@class,'nav')]" # Best Choice

#ViTriSo12
"vi-tri-so-12-cach-1" = "//div[text()='akhilppp']" # Best Choice
# Cách số 2 không khuyến khích, chỉ sử dụng khi cần action một cái gì đó
# (do dòng đầu tiên là Admin không có button Select nên chọn dòng 2, đề bài khúc này em không rõ)
# mà không biết value của nó thì có thể xài cách này
"vi-tri-so-12-cach-2" = "//div[contains(@class,'table-body')]/div[1]//i[contains(@class,'checkbox-input')]//ancestor::div[@role='cell']/following-sibling::div[1]"

#ViTriSo13
"vi-tri-so-13-cach-1" = "//div[text()='akhilppp']//ancestor::div[@role='cell']/following-sibling::div[1]" # Best Choice

#ViTriSo14
"vi-tri-so-14-cach-1" = "//div[text()='akhilppp']//ancestor::div[@role='cell']/following-sibling::div[last()]//i[contains(@class,'trash')]" # Best Choice

#ViTriSo15
"vi-tri-so-15-cach-1" = "//div[text()='akhilppp']//ancestor::div[@role='cell']/following-sibling::div[last()]//i[contains(@class,'pencil-fill')]" # Best Choice

#ViTriSo16
"vi-tri-so-16-cach-1" = "//div[text()='User Role']" # Best Choice

#ViTriSo17
"vi-tri-so-17-cach-1" = "//div[text()='Employee Name']" # Best Choice

#ViTriSo18
"vi-tri-so-18-cach-1" = "//h6[contains(.,'User Management')]" # Best Choice
"vi-tri-so-18-cach-2" = "//h6[contains(@class,'header-breadcrumb-level')]"

#ViTriSo19
"vi-tri-so-19-cach-1" = "//button[contains(@class,'main-menu-button')]" # Best Choice
"vi-tri-so-19-cach-2" = "//i[contains(@class,'bi-chevron-left')]//parent::button"

#ViTriSo20
"vi-tri-so-20-cach-1" = "//i[contains(@class,'caret-up-fill')]//parent::button" # Best Choice

#ViTriSo21
"vi-tri-so-21-cach-1" = "//button[contains(.,'Add')]" # Best Choice