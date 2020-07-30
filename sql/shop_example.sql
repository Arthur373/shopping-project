drop database shop_example;

create database shop_example;

use shop_example;
CREATE TABLE `products` (
  `id` bigint UNSIGNED primary key auto_increment,
  `img` varchar(200)  NOT NULL,
  `title` varchar(200)  NOT NULL,
  `text` text NOT NULL,
  `price` DECIMAL(6,2)  NOT NULL,
  `old_price` DECIMAL(6,2)  DEFAULT NULL,
  `created_at` timestamp  DEFAULT current_timestamp,
  `updated_at` timestamp  DEFAULT NULL,
  `images` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `products` (`id`, `img`, `title`, `text`, `price`, `old_price`, `images`) VALUES
(1, 'p1.jpg', 'addidas', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 141.99, 200.00, 'p2.jpg,p3.jpg'),
(2, 'p2.jpg', 'nike', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  160.99, 222.00, 'p3.jpg,p4.jpg'),
(3, 'p3.jpg', 'Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 40.99, 47.00, 'p4.jpg,p5.jpg'),
(4, 'p4.jpg', 'Boots N', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  120.99, 170.00, 'p5.jpg,p6.jpg'),
(5, 'p5.jpg', 'Grey Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  100.99, 150.00, 'p6.jpg,p7.jpg'),
(6, 'p6.jpg', 'Sport boots', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  90.99, 110.00, 'p7.jpg,p8.jpg'),
(7, 'p7.jpg', 'Pink line Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  70.99, 100.00, 'p8.jpg,p9.jpg'),
(8, 'p8.jpg', 'Pink line Ceds 2', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  150.99, 210.00, 'p9.jpg,p1.jpg'),
(9, 'p9.jpg', 'clouts 1', ' Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 24.99, 30.00, 'p10.jpg,p11.jpg'),
(10, 'p10.jpg', 'clouts 2', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 45.99, 52.00, 'p11.jpg,p12.jpg'),
(11, 'p11.jpg', 'clouts 3', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 40.99, 50.00, 'p12.jpg,p13.jpg'),
(12, 'p12.jpg', 'clouts 4', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 65.99, 70.00, 'p13.jpg,p14.jpg'),
(13, 'p13.jpg', 'clouts 5', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 50.99, 60.00, 'p14.jpg,p15.jpg'),
(14, 'p14.jpg', 'clouts 6', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 42.99, 43.00, 'p15.jpg,p16.jpg'),
(15, 'p15.jpg', 'clouts 7', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 35.99, 38.00, 'p16.jpg,p17.jpg'),
(16, 'p16.png', 'Boots', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 24.99, 26.00, 'p17.jpg,p18.jpg'),
(17, 'p17.jpg', 'boots style', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 36.99, 38.00, 'p18.jpg,p19.jpg'),
(18, 'p18.jpg', 'clouts 8', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 28.99, 54.00, 'p19.jpg,p20.jpg'),
(19, 'p19.png', 'strawberry', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 3.99, 4.50, 'p20.jpg,p21.png'),
(20, 'p20.png', 'grape', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2.99, 3.00, 'p21.png,p22.jpg'),
(21, 'p21.png', 'avocado', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 1.99, 2.00, 'p22.jpg,p23.jpg'),
(22, 'p22.jpg', 'orange', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2.99, 3.00, 'p23.jpg,p24.jpg'),
(23, 'p23.jpg', 'tomato', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 1.99, 2.00, 'p24.jpg,p25.jpg'),
(24, 'p24.jpg', 'broccoli', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2.99, 3.00, 'p25.jpg,p26.jpg'),
(25, 'p25.jpg', 'cherry', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 1.99, 2.00, 'p26.jpg,p21.png'),
(26, 'p26.jpg', 'kiwi', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 15.99, 22.00, 'p21.png,p20.jpg');


CREATE TABLE `deals` (
  `id` bigint UNSIGNED primary key auto_increment,
  `img` varchar(191)  NOT NULL,
  `title` varchar(191)  NOT NULL,
  `price` DECIMAL(6,2) NOT NULL,
  `old_price` DECIMAL(6,2) DEFAULT NULL,
  `created_at` timestamp  DEFAULT current_timestamp,
  `updated_at` timestamp  DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `deals` (`id`, `img`, `title`, `price`, `old_price`) VALUES
(1, 'r1.jpg', 'Black lace Heels', '189.00', '210.00'),
(2, 'r2.jpg', 'Black lace Heels', '189.00', '210.00'),
(3, 'r3.jpg', 'Black lace Heels', '189.00', '210.00'),
(4, 'r5.jpg', 'Black lace Heels', '189.00', '210.00'),
(5, 'r6.jpg', 'Black lace Heels', '189.00', '210.00'),
(6, 'r7.jpg', 'Black lace Heels', '189.00', '210.00'),
(7, 'r9.jpg', 'Black lace Heels', '189.00', '210.00'),
(8, 'r10.jpg', 'Black lace Heels', '189.00', '210.00'),
(9, 'r11.jpg', 'Black lace Heels', '189.00', '210.00');

CREATE TABLE `banner` (
  `id` int UNSIGNED primary key auto_increment,
  `img` varchar(191) NOT NULL,
  `title` varchar(191) DEFAULT NULL,
  `desc` text DEFAULT NULL,
  `created_at` timestamp DEFAULT current_timestamp,
  `updated_at` timestamp DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `banner` (`id`, `img`, `title`, `desc`) VALUES
(1, 'banner-img.png', 'Nike New <br>Collection!', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.'),
(2, 'banner-img.png', 'Nike New <br>Collection!', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.');

CREATE TABLE `menu` (
  `id` bigint UNSIGNED primary key auto_increment,
  `name` varchar(191) NOT NULL,
  `path` varchar(191)  NOT NULL,
  `parent_id` int NOT NULL,
  `created_at` timestamp DEFAULT current_timestamp,
  `updated_at` timestamp DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `menu` (`id`, `name`, `path`, `parent_id`) VALUES
(1, 'HOME', 'home', 0),
(2, 'SHOP', 'shop', 0),
(3, 'BLOG', 'blog', 0),
(4, 'CONTACT', 'contact', 0);

CREATE TABLE `users` (
  `id` bigint UNSIGNED primary key auto_increment,
  `name` varchar(191)  NOT NULL,
  `surname` varchar(191) NOT NULL,
  `email` varchar(191)  NOT NULL,
  `password` varchar(191)  NOT NULL,
  `active`  tinyint NOT NULL default 0,
  `created_at` timestamp DEFAULT current_timestamp,
  `updated_at` timestamp DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `roles` (
    id   tinyint  not null primary key auto_increment,
    role varchar(50) not null unique
);

CREATE TABLE `users_roles` (
    user_id int     not null,
    role_id tinyint not null,
    constraint user_id_foreign_key foreign key (user_id) references users (id),
    constraint role_id_foreign_key foreign key (role_id) references roles (id)
);

CREATE TABLE `categories` (
  `id` bigint UNSIGNED primary key auto_increment,
  `name` varchar(191)  NOT NULL,
  `slug` varchar(191)  NOT NULL,
  `created_at` timestamp  DEFAULT current_timestamp,
  `updated_at` timestamp  DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `categories` (`id`, `name`, `slug`) VALUES
(1, 'Shoes', 'shoes'),
(2, 'Clothes', 'clothes'),
(3, 'Addidas', 'addidas'),
(4, 'Fruits', 'fruits');


CREATE TABLE `product_category` (
  `product_id` bigint UNSIGNED not null,
  `category_id` bigint UNSIGNED not null,
  constraint product_id_foreign_key foreign key (product_id) references products (id),
  constraint category_id_foreign_key foreign key (category_id) references categories (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO `product_category` (`product_id`, `category_id`) VALUES
(1, 1),(2, 1),(3, 1),(4, 1),(5, 1),(6, 1),(7, 1),(8, 1),(9, 2),(10, 2),
(11, 2),(12, 2),(13, 2),(14, 2),(15, 3),(16, 3),(17, 3),(18, 3),(19, 4),(20, 4),
(21, 4),(22, 4),(23, 4),(24, 4),(25, 4),(26, 4),(1, 3);
