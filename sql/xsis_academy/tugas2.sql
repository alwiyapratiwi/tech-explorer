create database db_department;

create table department(
	id serial primary key not null,
	name_department varchar(100) not null
);

create table biodata(
	id serial primary key not null,
	first_name varchar(25) not null,
	last_name varchar(30) not null,
	dob date not null,
	pob varchar(50) not null,
	address text not null,
	marital_status boolean not null
);

create table employee(
	id serial primary key not null,
	biodata_id int not null references biodata(id),
	nip char(5) not null,
	status varchar(15) not null,
	salary int not null
);

create table contact_person(
	id serial primary key not null,
	biodata_id int not null references biodata(id),
	tipe varchar(10) not null,
	contact varchar(50) not null
);

create table tbfamily(
	id serial primary key not null,
	biodata_id int not null references biodata(id),
	name_family varchar(100) not null,
	status varchar(20) not null
);

create table tbposition (
	id serial primary key not null,
	name_position varchar(50) not null
);

create table employee_position(
	id serial primary key not null,
	employee_id int not null references employee(id),
	position_id int not null references tbposition(id)
);

create table employee_leave(
	id serial primary key not null,
	employee_id int not null references employee(id),
	periode char(4) not null,
	regular_quota int not null
);

create table leave(
	id serial primary key not null,
	tipe varchar(10) not null,
	deskripsi varchar(100) not null
);

create table leave_request(
	id serial primary key not null,
	employee_id int not null references employee(id),
	leave_id int not null references leave(id),
	start_date date not null,
	end_date date not null,
	alasan text not null
);

create table travel_type(
	id serial primary key not null,
	name_type_travel varchar(30) not null,
	travel_fee int not null
);

create table travel_request(
	id serial primary key not null,
	employee_id int not null references employee(id),
	travel_type_id int not null references travel_type(id),
	start_date date not null,
	end_date date not null
);

create table travel_settlement(
	id serial primary key not null,
	travel_request_id int not null references travel_request(id),
	item_name varchar(50) not null,
	item_cost int not null
);


insert into department (name_department) values 
('Recruitment'),
('Sales'),
('Human Resources'),
('General Affair');

select * from department;

insert into biodata (first_name, last_name, dob, pob, address, marital_status) values 
('Raya', 'Indriyani', '1991-01-01', 'Bali', 'Jl. Raya Baru, Bali', false),
('Rere', 'Wulandari', '1992-01-02', 'Bandung', 'Jl. Berkah Ramadhan, Bandung', false),
('Bunga', 'Maria', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true),
('Natasha', 'Wulan', '1990-04-10', 'Jakarta', 'Jl. Mawar Harum, Jakarta', false),
('Zahra', 'Aurelia Putri', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true),
('Katniss', 'Everdeen', '1989-01-12', 'Jakarta', 'Jl. Bunga Melati, Jakarta', true);

select * from biodata;

insert into employee (biodata_id, nip, status, salary) values 
(1, 'NX001', 'Permanen', 12000000),
(2, 'NX002', 'Kontrak', 15000000),
(4, 'NX003', 'Permanen', 13500000),
(5, 'NX004', 'Permanen', 12000000),
(6, 'NX005', 'Permanen', 17000000);

select * from employee;

insert into contact_person (biodata_id, tipe, contact) values 
(1, 'MAIL', 'rayaindriyani@gmail.com'),
(1, 'PHONE', '085612345678'),
(2, 'MAIL', 'rere.wulandari@gmail.com'),
(2, 'PHONE', '081312345678'),
(2, 'PHONE', '087812345678'),
(3, 'MAIL', 'bunga.maria@gmail.com'),
(4, 'MAIL', 'natasha.wulan@gmail.com'),
(5, 'MAIL', 'zahra.putri@gmail.com'),
(6, 'MAIL', 'katniss.everdeen@gmail.com');

select * from contact_person;

insert into tbfamily (biodata_id, name_family, status) values 
(3, 'Azka Fadlan Zikrullah', 'Suami'),
(3, 'Primrose Everdeen', 'Anak'),
(5, 'Jaka Samudera Buana', 'Suami'),
(5, 'Friska Davira', 'Anak'),
(5, 'Harum Indah Az Zahra', 'Anak'),
(6, 'Adya Pratama Yuda', 'Suami');

select * from tbfamily;

insert into tbposition (name_position) values 
('Direktur'),
('General Manager'),
('Manager'),
('Staff');

select * from tbposition;

insert into employee_position (employee_id, position_id) values 
(5, 1),
(4, 2),
(3, 3),
(2, 4),
(1, 4);

select * from employee_position;

insert into employee_leave (employee_id, periode, regular_quota) values 
(1, 2020, 16),
(2, 2020, 12),
(1, 2021, 16),
(2, 2021, 12),
(4, 2021, 12),
(5, 2021, 12),
(5, 2021, 12);

insert into leave (tipe, deskripsi) values 
('Regular', 'Cuti Tahunan'),
('Khusus', 'Cuti Menikah'),
('Khusus', 'Cuti Haji & Umroh'),
('Khusus', 'Melahirkan');

select * from leave;

insert into leave_request (employee_id, leave_id, start_date, end_date, alasan) values 
(1, 1, '2020-10-10', '2020-10-12', 'Liburan'),
(1, 1, '2020-11-12', '2020-11-15', 'Acara Keluarga'),
(2, 2, '2020-05-05', '2020-05-07', 'Menikah'),
(2, 1, '2020-09-09', '2020-09-13', 'Touring'),
(2, 1, '2020-12-24', '2020-12-25', 'Acara Keluarga');

select * from leave_request;

insert into travel_type (name_type_travel, travel_fee) values 
('In Indonesia', 200000),
('Out Indonesia', 350000);

select * from travel_type;

insert into travel_request (employee_id, travel_type_id, start_date, end_date) values 
(1, 1, '2020-07-07', '2020-07-08'),
(1, 1, '2020-08-07', '2020-08-08'),
(2, 2, '2020-04-04', '2020-04-07');

select * from travel_request;

insert into travel_settlement (travel_request_id, item_name, item_cost) values 
(1, 'Tiket travel Do-Car berangkat', 165000),
(1, 'Hotel', 750000),
(1, 'Tiket travel Do-Car pulang', 165000),
(2, 'Tiket pesawat berangkat', 750000),
(2, 'Hotel', 650000),
(2, 'Tiket pesawat pulang', 1250000),
(3, 'Tiket pesawat berangkat', 4750000),
(3, 'Hotel', 6000000),
(3, 'Tiket pesawat pulang', 4250000);

select * from travel_settlement;

-- 1. Tampilkan data lengkap karyawan dan rata-rata gaji setahun untuk masing-masing dari mereka
select  
e.id AS employee_id,
concat(b.first_name, ' ', b.last_name) as full_name,
b.dob as tanggal_lahir,
b.pob,
b.address,
b.marital_status,
e.nip,
e.status,
e.salary,
e.salary * 12 AS gaji_tahunan
from employee e
join biodata b ON e.biodata_id = b.id;


-- 2. Tambahkan 3 orang pelamar, dimana 2 di antaranya diterima sebagai karyawan kontrak 
-- dan 1 nya lagi tidak diterima sebagai karyawan. 
-- Lalu tampilkan semua biodata berupa fullname, nip, status karyawan dan salary
   
insert into biodata (first_name, last_name, dob, pob, address, marital_status) values 
('Kim', 'Taehyung', '1995-12-30', 'Bali', 'Jl. Raya Lama, Bali', false),
('Shawn', 'Mendes', '1998-08-08', 'Bandung', 'Jl. Berkah Lebaran, Bandung', false),
('Zayn', 'Malik', '1993-01-12', 'Bali', 'Jl. Raya Baru Lama, Bali', true);
   
insert into employee (biodata_id, nip, status, salary) values 
(7, 'NX006', 'Kontrak', 14000000),
(8, 'NX007', 'Kontrak', 14000000);
  
select 
concat(b.first_name, ' ',b.last_name) as full_name,
e.nip,
e.status,
e.salary
from employee e 
join biodata b on e.biodata_id = b.id;

-- 3. Tampilkan fullname pelamar yang tanggal lahirnya antara 01-01-1991 s/d 31-12-1991
select 
concat(b.first_name, ' ', b.last_name) as full_name, 
b.dob as tanggal_lahir 
from biodata b 
where b.dob between '1991-01-01' and '1991-12-31';

-- 4. Tampilkan nama-nama pelamar yang tidak diterima sebagai karyawan
select concat(b.first_name, ' ' ,b.last_name) as full_name 
from biodata b 
where b.id not in (select e.biodata_id from employee e);

-- 5. Buat query untuk memasukkan request cuti tersebut lalu tampilkan datanya seperti berikut:
-- INSERT INTO leave_request
-- VALUES (6, 3, 1, TO_DATE('2020-03-01', 'YYYY-MM-DD'), TO_DATE('2020-03-02', 'YYYY-MM-DD'), 'Reunian');

insert into leave_request (employee_id, leave_id, start_date, end_date, alasan) values 
(3, 1, '2020-03-01', '2020-03-02', 'Reunian');

select * from leave_request;

select  
lr.id as request_id,
concat(b.first_name, ' ', b.last_name) as full_name,
l.tipe as leave_type,
lr.start_date,
lr.end_date,
lr.alasan 
from 
leave_request lr
join employee e on lr.employee_id = e.id
join biodata b on e.biodata_id = b.id
join leave l on lr.leave_id = l.id
WHERE lr.id = 6;

-- 6. Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, dan total pengeluarannya
-- selama perjalanan dinas tersebut
select 
concat (b.first_name, ' ', b.last_name) as full_name, 
tt.name_type_travel as travel_type,
tr.start_date,
tr.end_date,
sum(ts.item_cost) as total_pengeluaran
from travel_request tr 
join employee e on tr.employee_id = e.id 
join biodata b on e.biodata_id = b.id 
join travel_type tt on tr.travel_type_id = tt.id 
join travel_settlement ts on tr.id = ts.travel_request_id
group by b.first_name, b.last_name, tt.name_type_travel, tr.start_date, tr.end_date;


-- 7. Tampilkan sisa cuti tahun 2020 yang dimiliki oleh karyawan
-- SELECT CONCAT(b.first_name, ' ' ,b.last_name) AS nama, el.period, el.regular_quota AS "Sisa Kuota 2020"

select 
concat(b.first_name, ' ', b.last_name) as full_name,
e.nip,
el.regular_quota,
sum(lr.end_date-lr.start_date+1),
(el.regular_quota - (sum(lr.end_date-lr.start_date+1))) as sisa_cuti
from employee e
join biodata b on b.id = e.biodata_id
join leave_request lr on lr.employee_id = e.id
join employee_leave el on el.employee_id = e.id
where el."periode" = '2020'
group by b.first_name, b.last_name, e.nip, lr.employee_id, el.regular_quota;


-- 8. Urutkan nama-nama karyawan dan statusnya, diurutkan dari yang paling tua ke yang paling muda
select 
concat (b.first_name, ' ', b.last_name) as full_name, 
e.status,
b.dob 
from biodata b 
join employee e on b.id = e.biodata_id 
order by b.dob;

-- 9. Tampilkan selisih antara total item cost dengan total travel fee untuk masing-masing karyawan
select  
concat (b.first_name, ' ', b.last_name) as full_name, 
sum(ts.item_cost) as total_item_cost,
sum(tt.travel_fee) as total_travel_fee,
(sum(ts.item_cost) - sum(tt.travel_fee)) as selisih_biaya,
(tr.end_date - tr.start_date) as total_date
from travel_settlement ts 
join travel_request tr on tr.id = ts.travel_request_id 
join travel_type tt on tt.id = tr.travel_type_id 
join employee e on e.id = tr.employee_id 
join biodata b on b.id = e.biodata_id 
group by tr.employee_id, b.first_name, b.last_name, tr.travel_type_id, total_date;

create view view_total_fee as
select 
	tr2.employee_id,
	(tt.travel_fee * sum(tr2.start_date-tr2.start_date+1)) as total_fee
from travel_request tr2
right join travel_type tt on tt.id = tr2.travel_type_id 
group by tr2.employee_id, travel_type_id, tt.travel_fee;

select * from view_total_fee;

select 
tr.employee_id,
sum(item_cost) as total_settlement,
(select total_fee from view_total_fee where employee_id = tr.employee_id) as total_fee,
(sum(item_cost) - (select total_fee from view_total_fee where employee_id = tr.employee_id)) as selisih
from travel_settlement ts 
join travel_request tr on tr.id = ts.travel_request_id 
group by tr.employee_id  

-- 10. Tambahkan data cuti tahun 2021 terhadap semua karyawan(termasuk karyawan baru yang sudah ditambahkan pada soal sebelumnya). 
-- Lalu hitung jumlah cuti yang sudah diambil pada tahun 2020 dari masing-masing karyawan.
-- Constraint : Data cuti karyawan baru tidak perlu ditampilkan

select * from employee_leave;

select * from leave_request;

select * from employee;

insert into employee_leave (employee_id, periode, regular_quota) values 
(1, '2021', 16),
(2, '2021', 12),
(3, '2021', 16),
(4, '2021', 12),
(5, '2021', 16);

select  
concat(b.first_name, ' ', b.last_name) as full_name,
e.nip,
(sum(lr.end_date - lr.start_date +1) )as sisa_cuti
from employee e 
join biodata b on b.id = e.biodata_id 
join leave_request lr on lr.employee_id = e.id 
join employee_leave el on el.employee_id = e.id
where el.periode = '2020'
group by b.first_name, b.last_name, e.nip, lr.employee_id, el.regular_quota ;

select * from biodata b 
join employee e on e.biodata_id = b.id;

insert into employee_leave (employee_id, periode, regular_quota) values 
(7, 2021, 12),
(8, 2021, 12);

insert into leave_request (employee_id, leave_id, start_date, end_date, alasan) values 
(7, 1, '2020-07-27', '2021-07-27', 'Daftar Sekolah'),
(8, 1, '2021-07-28', '2021-07-31', 'Mengikuti Tes');

select * from leave_request lr ;

--=============================================================================================
-- 1. tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing karyawan saat ini
-- (kalau tidak ada anak tulis 0 atau '-' saja)
select 
concat(b.first_name, ' ' ,b.last_name) as full_name,
extract(year from age(current_date, b.dob)) as usia,
t.name_position as jabatan,
coalesce(count(t2.id), 0) as jumlah_anak
from employee e 
join biodata b on e.biodata_id = b.id 
join employee_position ep on e.id = ep.employee_id 
join tbposition t on ep.position_id = t.id 
left join tbfamily t2 on b.id = t2.biodata_id and t2.status = 'Anak'
group by b.id, t.name_position;

select * from tbfamily;


-- 2. tampilkan nama-nama pelamar yang tidak diterima sebagai karyawan
select 
concat(b.first_name, ' ' ,b.last_name) as full_name 
from biodata b 
where b.id not in (select e.biodata_id from employee e);

-- 3. hitung berapa rata-rata gaji karyawan dengan level staff
select 
avg(salary) as avg_staff
from employee e
join employee_position ep on e.id = ep.employee_id 
join tbposition tp on ep.position_id = tp.id 
where tp.name_position = 'Staff';

-- 4. hitung berapa rata-rata gaji karyawan dengan level managerial (non staff)
select 
avg(salary) as avg_direktur
from employee e
join employee_position ep on e.id = ep.employee_id 
join tbposition tp on ep.position_id = tp.id 
where tp.name_position = 'Direktur';

select 
avg(salary) as avg_manager
from employee e
join employee_position ep on e.id = ep.employee_id 
join tbposition tp on ep.position_id = tp.id 
where tp.name_position = 'Manager';

select 
avg(salary) as avg_gm
from employee e
join employee_position ep on e.id = ep.employee_id 
join tbposition tp on ep.position_id = tp.id 
where tp.name_position = 'General Manager';

select * from tbposition;

select * from employee;

select * from biodata;

select * from employee_position;

-- 5. hitung ada berapa karyawan yang sudah menikah dan yang tidak menikah
-- (tabel : menikah x orang, tidak menikah x orang)
select 
	case when marital_status 
	then 'Menikah'
	else 'Tidak Menikah'
end as status_pernikahan,
count(*) as jumlah_karyawan
from biodata b 
group by marital_status;
							
select * from biodata;

-- 6. jika digabungkan antara cuti dan perjalanan dinas
-- berapa hari Raya tidak berada dikantor pada tahun 2020?











   





















