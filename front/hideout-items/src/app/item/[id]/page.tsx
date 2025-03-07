export default async function DetailItem({params}:{params: Promise<{id: number}>}){
    const {id} = await params

    return (
        <div>
            <h1>Item Id {id}</h1>
        </div>
    )
}