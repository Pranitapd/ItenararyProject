INSERT INTO user_profile (password,name,email_id,phone_number) VALUES('Pranita123','Pranita','abc@gmail.com',98088);
INSERT INTO user_profile (password,name,email_id,phone_number) VALUES('Chi123','Chichi','chi@gmail.com',9632);
INSERT INTO place (name ,description,user_profile_id) VALUES ('Bengaluru', 'IT city',1);
INSERT INTO place (name ,description,user_profile_id) VALUES ('Pune', 'Shiskhsa Mandir',2);
INSERT INTO activities (description,entry_charges,dist_frm_htl,place_id) VALUES ('Camel Ride', 200,4,1);
INSERT INTO activities (description,entry_charges,dist_frm_htl,place_id) VALUES ('WaterPolo', 400,5,2);
INSERT INTO reviews (review,place_id,user_id) VALUES ('Loved this club ambience',1,1);
INSERT INTO reviews (review,place_id,user_id) VALUES ('awesome crocodile',2,2);
INSERT INTO interests (interest ,description) VALUES('Rock climb', 'Rock climbing');
INSERT INTO interests (interest ,description) VALUES('Clubing', 'clubs');
INSERT INTO attractions (description,dist_frm_htl,entry_charges,place_id) VALUES ('WaterFall',2,400, 1);
INSERT INTO attractions (description,dist_frm_htl,entry_charges,place_id) VALUES ('Zoo',3, 300,1);
INSERT INTO attractions (description,dist_frm_htl,entry_charges,place_id) VALUES ('Flower garden',4, 400,2);
INSERT INTO attractions (description,entry_charges,dist_frm_htl,place_id) VALUES ('Hopi Pola club', 500,3,2);