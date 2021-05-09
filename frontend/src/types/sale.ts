import { Seller } from "./sellers"

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}
export type SalePage = {

    content?: Sale[];
    last: boolean;
    totalElements:number;
    totalPages: number;
    size?: number;
    number: number;
    fisrt: boolean;
    numberOfElements?: number;
    empty?: boolean;

}


export type SaleSum = {

    sellerName: string;
    sum: number;
}
export type SaleSuccess = {
    sellerName: String;
    visited: number;
    deals: number;
}